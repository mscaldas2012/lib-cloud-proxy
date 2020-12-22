package gov.cdc.ncezid.cloud.azure

import gov.cdc.ncezid.cloud.storage.CloudStorage

import com.azure.storage.blob.BlobContainerClient
import com.azure.storage.blob.BlobServiceClient
import com.azure.storage.blob.BlobServiceClientBuilder
import com.azure.storage.blob.models.BlobProperties
import io.micronaut.context.annotation.Requires
import io.micronaut.http.MediaType
import org.slf4j.LoggerFactory
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.*
import javax.inject.Singleton

@Singleton
@Requires(property="cloud_environment", value="AZURE")
class BlobProxy(private val azureConfig: AzureConfig): CloudStorage {
    companion object {
        private val logger = LoggerFactory.getLogger(BlobProxy::class.java.name)
    }

//     private var blobContainerClient: BlobContainerClient = initClient()
    private var blobServiceClient: BlobServiceClient = initClient()
    
    private fun initClient( ): BlobServiceClient {
        return BlobServiceClientBuilder().connectionString(azureConfig.blob_connectStr).buildClient()
    }


    override fun list(container: String, maxNumber: Int, prefix: String?): List<String> {
        TODO("Not yet implemented")
    }

    override fun listFolders(container: String): List<String> {
        TODO("Not yet implemented")
    }

    override fun getFileContent(container: String, fileName: String): String {
        val blobContainerClient = blobServiceClient.getBlobContainerClient(container)
        val blobClient = blobContainerClient.getBlobClient(fileName)
        val input = blobClient.openInputStream() as InputStream
        val inputStream = InputStreamReader(input, StandardCharsets.UTF_8)
        val s = Scanner(inputStream).useDelimiter("\\A")
        return if (s.hasNext()) s.next() else ""
    }

    override fun getFileContentAsInputStream(container:String, fileName: String): InputStream {
        TODO("Not yet implemented")
    }

    override fun getMetadata(container:String, fileName: String): Map<String, String> {
        val blobProperties = getProperties(container, fileName)
        val result =  blobProperties.metadata as MutableMap<String, String>
        result["last_modified"] = blobProperties.lastModified.toInstant().toString()
        return result
    }

    override fun saveFile(container: String, fileName: String, content: String, metadata: Map<String, String>?, contentType: String) {
        TODO("Not yet implemented")
    }

    override fun saveFile(container: String, fileName: String, content: InputStream, size: Long, metadata: Map<String, String>?, contentType: String) {
        TODO("Not yet implemented")
    }

    override fun deleteFile(container: String, fileName: String): Int {
        TODO("Not yet implemented")
    }


    fun getProperties(container: String, key: String): BlobProperties {
        val blobContainerClient = blobServiceClient.getBlobContainerClient(container)
        val blobClient = blobContainerClient.getBlobClient(key)
        return blobClient.properties
    }

}
