package gov.cdc.ncezid.cloud.storage.azure

import com.azure.storage.blob.BlobServiceClient
import com.azure.storage.blob.BlobServiceClientBuilder
import com.azure.storage.blob.models.BlobProperties
import gov.cdc.ncezid.cloud.AzureConfig
import gov.cdc.ncezid.cloud.storage.CloudStorage
import gov.cdc.ncezid.cloud.util.withMetrics
import io.micrometer.core.instrument.MeterRegistry
import io.micronaut.context.annotation.Requires
import org.slf4j.LoggerFactory
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.*
import javax.inject.Singleton

@Singleton
@Requires(property = "azure.blob_connectStr")
class BlobProxy(private val azureConfig: AzureConfig, private val meterRegistry: MeterRegistry? = null) : CloudStorage {
    private val logger = LoggerFactory.getLogger(BlobProxy::class.java.name)

    init {
        logger.info("Initializing BlobProxy with config: {}", azureConfig)
    }

    private val blobServiceClient: BlobServiceClient =
        BlobServiceClientBuilder().connectionString(azureConfig.blob.connectStr).buildClient()

    /**
     * This was introduced to be able to provide a 'silent' call to the aws s3 api
     */
    override fun healthCheck(): String = meterRegistry.withMetrics("blob.healthcheck") {
        TODO("Not yet implemented")
    }

    override fun list(container: String, maxNumber: Int, prefix: String?): List<String> =
        meterRegistry.withMetrics("blob.list") {
            TODO("Not yet implemented")
        }

    override fun list(maxNumber: Int, prefix: String?): List<String> =
        list(azureConfig.blob.container, maxNumber, prefix)

    override fun listFolders(container: String): List<String> = meterRegistry.withMetrics("blob.listFolders") {
        TODO("Not yet implemented")
    }

    override fun listFolders(): List<String> = listFolders(azureConfig.blob.container)

    override fun getFileContent(container: String, fileName: String): String =
        meterRegistry.withMetrics("blob.getFileContent") {
            val blobContainerClient = blobServiceClient.getBlobContainerClient(container)
            val blobClient = blobContainerClient.getBlobClient(fileName)
            val input = blobClient.openInputStream() as InputStream
            val inputStream = InputStreamReader(input, StandardCharsets.UTF_8)
            val s = Scanner(inputStream).useDelimiter("\\A")
            if (s.hasNext()) s.next() else ""
        }

    override fun getFileContent(fileName: String): String = getFileContent(azureConfig.blob.container, fileName)

    override fun getFileContentAsInputStream(container: String, fileName: String): InputStream =
        meterRegistry.withMetrics("blob.getFileContentAsInputStream") {
            TODO("Not yet implemented")
        }

    override fun getFileContentAsInputStream(fileName: String): InputStream =
        getFileContentAsInputStream(azureConfig.blob.container, fileName)

    override fun getMetadata(container: String, fileName: String): Map<String, String> =
        meterRegistry.withMetrics("blob.getMetadata") {
            val blobProperties = getProperties(container, fileName)
            val result = blobProperties.metadata as MutableMap<String, String>
            result["last_modified"] = blobProperties.lastModified.toInstant().toString()
            result
        }

    override fun getMetadata(fileName: String): Map<String, String> = getMetadata(azureConfig.blob.container, fileName)

    override fun saveFile(
        container: String,
        fileName: String,
        content: String,
        metadata: Map<String, String>?,
        contentType: String
    ) = meterRegistry.withMetrics("blob.saveFile") {
        TODO("Not yet implemented")
    }

    override fun saveFile(
        container: String,
        fileName: String,
        content: InputStream,
        size: Long,
        metadata: Map<String, String>?,
        contentType: String
    ) = meterRegistry.withMetrics("blob.saveFile.inputStream") {
        TODO("Not yet implemented")
    }

    override fun saveFile(fileName: String, content: String, metadata: Map<String, String>?, contentType: String) =
        saveFile(azureConfig.blob.container, fileName, content, metadata, contentType)

    override fun saveFile(
        fileName: String,
        content: InputStream,
        size: Long,
        metadata: Map<String, String>?,
        contentType: String
    ) = saveFile(azureConfig.blob.container, fileName, content, size, metadata, contentType)

    override fun deleteFile(container: String, fileName: String): Int = meterRegistry.withMetrics("blob.deleteFile") {
        TODO("Not yet implemented")
    }

    override fun deleteFile(fileName: String): Int = deleteFile(azureConfig.blob.container, fileName)

    fun getProperties(container: String, key: String): BlobProperties {
        val blobContainerClient = blobServiceClient.getBlobContainerClient(container)
        val blobClient = blobContainerClient.getBlobClient(key)
        return blobClient.properties
    }

}
