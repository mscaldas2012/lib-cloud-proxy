package gov.cdc.ncezid.cloud.azure

import gov.cdc.ncezid.cloud.storage.CloudStorage

import com.azure.storage.blob.BlobContainerClient
import com.azure.storage.blob.BlobServiceClientBuilder
import com.azure.storage.blob.models.BlobProperties
import io.micronaut.context.annotation.Requires
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

     private var blobContainerClient: BlobContainerClient = initClient()

    private fun initClient(): BlobContainerClient {
        val blobServiceClient = BlobServiceClientBuilder().connectionString(azureConfig.blob_connectStr).buildClient()
        return blobServiceClient.getBlobContainerClient(azureConfig.blob_container)
    }

    override fun list(folder: String): List<String> {
        TODO("Not yet implemented")
    }

    override fun listFolders(): List<String> {
        TODO("Not yet implemented")
    }

    override fun getFileContent(objectKey: String): String {
        val blobClient = blobContainerClient.getBlobClient(objectKey)
        val input = blobClient.openInputStream() as InputStream
        val inputStream = InputStreamReader(input, StandardCharsets.UTF_8)
        val s = Scanner(inputStream).useDelimiter("\\A")
        return if (s.hasNext()) s.next() else ""
    }

    override fun getFileContentAsInputStream(objectKey: String): InputStream {
        TODO("Not yet implemented")
    }

    override fun getMetadata(objectKey: String): Map<String, String> {
        val blobProperties = getProperties(objectKey)
        val result =  blobProperties.metadata as MutableMap<String, String>
        result["last_modified"] = blobProperties.lastModified.toInstant().toString()
        return result
    }

    override fun saveFile(objectKey: String, metadata: Map<String, String>, message: String) {
        TODO("Not yet implemented")
    }

    override fun saveFile(objectKey: String, message: String) {
        TODO("Not yet implemented")
    }

    override fun deleteFile(key: String): Int {
        TODO("Not yet implemented")
    }

    fun getProperties(key: String): BlobProperties {
        val blobClient = blobContainerClient.getBlobClient(key)
        return blobClient.properties
    }

}
