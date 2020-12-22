package gov.cdc.ncezid.cloud.aws

import gov.cdc.ncezid.cloud.storage.CloudStorage
import io.micronaut.context.annotation.Requires
import io.micronaut.http.MediaType
import org.slf4j.LoggerFactory
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration
import software.amazon.awssdk.core.sync.RequestBody
import software.amazon.awssdk.core.sync.ResponseTransformer
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.*
import java.io.*
import java.time.Duration
import java.util.*
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import javax.inject.Singleton

@Singleton
@Requires(property="cloud_environment", value="AWS")
class S3Proxy(val awsconfig: AWSConfig) : CloudStorage {
    companion object {
        private val logger = LoggerFactory.getLogger(S3Proxy::class.java.name)
        private const val FILE_5MB = (5 * 1024 * 1024).toLong()
    }

    init {
        logger.info("AUDIT- S3Config starting...")
    }

    @Throws
    private fun fetchS3Client(): S3Client {
        logger.debug("awsconfig: region: ${awsconfig.region}")
        val overrideConfiguration = ClientOverrideConfiguration.builder()
                .apiCallTimeout(Duration.ofSeconds(60))
                .apiCallAttemptTimeout(Duration.ofSeconds(20))
                .build()
        return S3Client.builder()
                    .overrideConfiguration(overrideConfiguration)
                    .region(Region.of(awsconfig.region))
                    .build()
    }

    @Throws
    override fun getFileContent(bucket: String, fileName: String): String {
        return try {
            val objectRequest = GetObjectRequest.builder()
                    .bucket(bucket)
                    .key(fileName)
                    .build()
            val fileContent = fetchS3Client().getObject(objectRequest, ResponseTransformer.toInputStream())
            val inputAsString = fileContent.bufferedReader().use { it.readText() }
            fileContent.close()

            return inputAsString
        } catch (e: NoSuchKeyException) {
            getZipContent(bucket, fileName)
        }
    }

    override fun getFileContentAsInputStream(bucket: String, fileName: String): InputStream {
        logger.debug("Retrieving object $fileName")
        val req = GetObjectRequest.builder().bucket(bucket).key(fileName).build()
        val res = fetchS3Client().getObject(req)
        return ByteArrayInputStream(res.readAllBytes())
    }

    @Throws
    override fun getMetadata(bucket: String, fileName: String): Map<String, String> {
            val headObjectRequest = HeadObjectRequest.builder()
                    .bucket(bucket)
                    .key(fileName)
                    .build()
            val s3metadata = fetchS3Client().headObject(headObjectRequest)
            val md = s3metadata.metadata()
            val result:MutableMap<String, String> = mutableMapOf()

            result["last_modified"] = s3metadata.lastModified().toString()
            result.putAll(md)

            return result
    }

    override fun saveFile(bucket: String, fileName: String, content:String, metadata: Map<String, String>?, contentType: String) {
        logger.info("\tfile is being stored to S3 ")
        val request = PutObjectRequest.builder()
                .key(fileName)
                .contentType(contentType)
                .bucket(bucket)
        metadata.let { request.metadata(metadata) }
        val fullRequest = request.build()
        val body = RequestBody.fromString(content)

        val putObjectResponse = fetchS3Client().putObject(fullRequest, body)
        logger.info("\tfile stored to S3 response: $putObjectResponse")
    }

    override fun saveFile(bucket: String, fileName: String, content:InputStream, size: Long, metadata: Map<String, String>?, contentType: String) {
        if (size > FILE_5MB)
            uploadMultipartFile(bucket, content, fileName, size,metadata ?: mapOf())
        else uploadSinglePart(bucket, fileName, content, size, contentType , metadata)
    }

    //Retrieves the first X number of files on a folder (if prefix is provided) or root if prefix is null:
    override fun list(bucket: String, maxNumber:Int, prefix: String?): List<String> {
        logger.info("Listing objects")
        val listObjects = ListObjectsRequest
                .builder()
                .bucket(bucket)
                .maxKeys(maxNumber)

        prefix.let { listObjects.prefix(prefix)}
        val fullRequest = listObjects.build()

        val res: ListObjectsResponse = fetchS3Client().listObjects(fullRequest)
        val objects = res.contents()

        val resultList = objects.map { it.key() }
        return  resultList
    }

    override fun listFolders(bucket: String ): List<String> {
        val objects = list(bucket, 100)
        return objects.map { it.substring(0, Math.max(it.indexOf("/"), 0)) }.filter{it != ""}.distinctBy { it }
    }

    override fun deleteFile(bucket: String, fileName: String): Int {
        val keyAsList = listOf(ObjectIdentifier.builder().key(fileName).build())
        val dor: DeleteObjectsRequest = DeleteObjectsRequest.builder()
            .bucket(bucket)
            .delete(Delete.builder().objects(keyAsList).build())
            .build()
        val delResp: DeleteObjectsResponse = fetchS3Client().deleteObjects(dor)
        return delResp.deleted().size
    }

    private fun uploadSinglePart(bucket: String, fileName: String, content: InputStream, contentLength: Long, contentType: String = MediaType.TEXT_PLAIN, metadata: Map<String, String>? = null) {
        logger.info("Saving new file $fileName")
        val key = fileName

        val request = PutObjectRequest.builder()
                .key(key)
                .contentType(contentType)
                .bucket(bucket)
        metadata.let { request.metadata(metadata) }

        val fulRequest = request.build()
        val body = RequestBody.fromInputStream(content, contentLength)
        fetchS3Client().putObject(fulRequest, body)

    }
    //Multipart uploads:
    private fun uploadMultipartFile(bucket: String, file: InputStream, filename: String, contentLength: Long, metadata: Map<String, String>) {
        val s3Client = fetchS3Client()
        val key = filename
        logger.info("Processing multipart bucket: $bucket, key: $key.")
        //Create multipart upload request and response
        val uploadId: String = createMultipartUpload(key, bucket, metadata, s3Client)
        //upload part by part
        val completedPartList: List<CompletedPart> = uploadMultiParts(file, contentLength, bucket, key, uploadId, s3Client)
        // merge all parts uploaded
        val eTag: String = completeMultiParts(completedPartList, bucket, key, uploadId, s3Client)
    }

    private fun createMultipartUpload(key: String, bucket: String, metadata: Map<String, String>, s3Client: S3Client): String {
        val createMultipartUploadRequest = CreateMultipartUploadRequest.builder()
                .key(key)
                .bucket(bucket)
                .metadata(metadata)
                .build()
        val multipartUploadResponse = s3Client.createMultipartUpload(createMultipartUploadRequest)
        return multipartUploadResponse.uploadId()
    }

    @Throws(IOException::class)
    private fun uploadMultiParts(file: InputStream,
                                 contentLength: Long,
                                 bucket: String,
                                 key: String,
                                 uploadId: String,
                                 s3Client: S3Client): List<CompletedPart> {
        var partSize = FILE_5MB // Set part size to 5 MB.
        var filePosition: Long = 0
        val completedPartList: MutableList<CompletedPart> = ArrayList()
        var i = 1
        while (filePosition < contentLength) {
            // last part could be less than 5 MB, adjust the part size as needed.
            partSize = Math.min(partSize, contentLength - filePosition)
            // Create the request to upload a part.
            val uploadRequest = UploadPartRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .uploadId(uploadId)
                    .partNumber(i)
                    .contentLength(partSize)
                    .build()
            //s3Client.upload
            val eTag = s3Client.uploadPart(uploadRequest, RequestBody.fromInputStream(file, contentLength)).eTag()
            logger.info("part# $i , eTag: $eTag , fileposition: ${filePosition / (1024 * 1024)}MB, partsize: ${partSize / (1024 * 1024)}MB, contentLength: $contentLength.")
            val completedPart = CompletedPart.builder().partNumber(i).eTag(eTag).build()
            completedPartList.add(completedPart)
            filePosition += partSize
            i++
        }
        return completedPartList
    }

    private fun completeMultiParts(completedPartList: List<CompletedPart>,
                                   bucket: String,
                                   key: String,
                                   uploadId: String,
                                   s3Client: S3Client): String {
        val completedMultipartUpload = CompletedMultipartUpload.builder()
                .parts(completedPartList)
                .build()
        val completeMultipartUploadRequest = CompleteMultipartUploadRequest.builder()
                .bucket(bucket)
                .key(key)
                .uploadId(uploadId)
                .multipartUpload(completedMultipartUpload)
                .build()
        //Complete the multipart upload.
        val completeMultipartUploadResponse = s3Client.completeMultipartUpload(completeMultipartUploadRequest)
        //log.info("final etag: {}", eTag);
        return completeMultipartUploadResponse.eTag().replace("\"".toRegex(), "")
    }

    private fun getZipContent(bucket: String, config: String): String {
        logger.info("Reading zip...")
        val req = GetObjectRequest.builder().bucket(bucket).key("${config}.zip").build()
        val res = fetchS3Client().getObject(req)
        val s3Content = res.readAllBytes()

        val tempFile = File.createTempFile(UUID.randomUUID().toString(), ".tmp")
        tempFile.writeBytes(s3Content)
        try {
            ZipFile(tempFile).use { zf ->
                logger.debug(String.format("Inspecting contents of: %s\n", zf.name))
                val zipEntries = zf.entries()
                val iterator: Iterator<*> = zipEntries.asIterator() //.forEachRemaining(entry -> {
                //while (iterator.hasNext()) {
                val entry = iterator.next() as ZipEntry
                return zf.getInputStream(entry).bufferedReader().use(BufferedReader::readText)
                //}
            }
        } finally {
            tempFile.delete();
        }
    }
}