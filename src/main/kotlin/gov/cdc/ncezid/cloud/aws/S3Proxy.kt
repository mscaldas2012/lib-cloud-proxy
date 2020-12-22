package gov.cdc.ncezid.cloud.aws

import gov.cdc.ncezid.cloud.storage.CloudStorage
import io.micronaut.context.annotation.Requires
import org.slf4j.LoggerFactory
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration
import software.amazon.awssdk.core.sync.RequestBody
import software.amazon.awssdk.core.sync.ResponseTransformer
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.*
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.time.Duration
import javax.inject.Singleton

@Singleton
@Requires(property="cloud_environment", value="AWS")
class S3Proxy(val awsconfig: AWSConfig) : CloudStorage {
    private val logger = LoggerFactory.getLogger(S3Proxy::class.java.name)

    init {
        logger.info("AUDIT- S3Config starting.. will process files form ${awsconfig.bucket}")
    }

    @Throws
    private fun fetchS3Client(): S3Client {
        logger.debug("awsconfig: ${awsconfig.bucket}, ${awsconfig.region}")
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
    override fun getFileContent(objectKey: String): String {
            val objectRequest = GetObjectRequest.builder()
                    .bucket(awsconfig.bucket)
                    .key(objectKey)
                    .build()
            val fileContent = fetchS3Client().getObject(objectRequest, ResponseTransformer.toInputStream())
            val inputAsString = fileContent.bufferedReader().use { it.readText() }
            fileContent.close()

            return inputAsString
    }

    override fun getFileContentAsInputStream(objectKey: String): InputStream {
        logger.debug("Retrieving object $objectKey")
        val req = GetObjectRequest.builder().bucket(awsconfig.bucket).key(objectKey).build()
        val res = fetchS3Client().getObject(req)
        return ByteArrayInputStream(res.readAllBytes())
    }

    @Throws
    override fun getMetadata(objectKey: String): Map<String, String> {
            val headObjectRequest = HeadObjectRequest.builder()
                    .bucket(awsconfig.bucket)
                    .key(objectKey)
                    .build()
            val s3metadata = fetchS3Client().headObject(headObjectRequest)
            val md = s3metadata.metadata()
            val result:MutableMap<String, String> = mutableMapOf()

            result["last_modified"] = s3metadata.lastModified().toString()
            result.putAll(md)

            return result
    }

    override fun saveFile(objectKey: String, metadata: Map<String, String>, message:String ) {
        logger.info("\tfile is being stored to S3 ")
        val request = PutObjectRequest.builder()
                .key(objectKey)
                .metadata(metadata)
                .contentType("text/plain")
                .bucket(awsconfig.bucket)
                .build()
        //val decodedContent = String(Base64.getDecoder().decode(message))
        val body = RequestBody.fromString(message)

        val putObjectResponse = fetchS3Client().putObject(request, body)
        logger.info("\tfile stored to S3 response: $putObjectResponse")
    }
    override fun saveFile(objectKey: String,  message:String ) {
        logger.info("\tfile is being stored to S3 ")
        val request = PutObjectRequest.builder()
            .key(objectKey)
            .contentType("text/plain")
            .bucket(awsconfig.bucket)
            .build()
        //val decodedContent = String(Base64.getDecoder().decode(message))
        val body = RequestBody.fromString(message)

        val putObjectResponse = fetchS3Client().putObject(request, body)
        logger.debug("\tfile stored to S3 response: $putObjectResponse")
    }

    //Retrives the first X number of configs:
    override fun list(folder: String ): List<String> {
        logger.info("Listing objects")
        val listObjects = ListObjectsRequest
            .builder()
            .bucket(awsconfig.bucket)
            .prefix(folder + if (folder.isNotBlank())  "/" else "")
            .build()

        val res: ListObjectsResponse = fetchS3Client().listObjects(listObjects)
        val objects = res.contents()

        val resultList = objects.map { it.key() }
        return  resultList
    }
    override fun listFolders( ): List<String> {
        val objects = list("")
        return objects.map { it.substring(0, it.indexOf("/")) }.distinctBy { it }
    }

    override fun deleteFile(key: String): Int {
        val keyAsList = listOf(ObjectIdentifier.builder().key(key).build())
        val dor: DeleteObjectsRequest = DeleteObjectsRequest.builder()
            .bucket(awsconfig.bucket)
            .delete(Delete.builder().objects(keyAsList).build())
            .build()
        val delResp: DeleteObjectsResponse = fetchS3Client().deleteObjects(dor)
        return delResp.deleted().size
    }
}