package gov.cdc.ncezid.cloud.storage.azure

import com.azure.storage.blob.BlobServiceClient
import com.azure.storage.blob.BlobServiceClientBuilder
import com.azure.storage.blob.models.BlobProperties
import gov.cdc.ncezid.cloud.AzureConfig
import gov.cdc.ncezid.cloud.Providers
import gov.cdc.ncezid.cloud.storage.CloudFile
import gov.cdc.ncezid.cloud.storage.CloudStorage
import gov.cdc.ncezid.cloud.util.decode
import gov.cdc.ncezid.cloud.util.validateFor
import gov.cdc.ncezid.cloud.util.withMetrics
import io.micrometer.core.instrument.MeterRegistry
import io.micronaut.context.annotation.Requires
import org.slf4j.LoggerFactory
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.*
import javax.inject.Singleton

private const val VAR_CONTAINER = "blob.container"

@Singleton
@Requires(property = "azure.blob")
class BlobProxy(private val azureConfig: AzureConfig, private val meterRegistry: MeterRegistry? = null) : CloudStorage {
    private val logger = LoggerFactory.getLogger(BlobProxy::class.java.name)

    init {
        logger.info("Initializing BlobProxy with config: {}", azureConfig)
    }

    override fun provider(): Providers = Providers.Azure

    private val blobServiceClient: BlobServiceClient = azureConfig.blob.connectStr.validateFor("blob.connectStr") {
        BlobServiceClientBuilder().connectionString(it).buildClient()
    }

    /**
     * This was introduced to be able to provide a 'silent' call to the aws s3 api
     */
    override fun healthCheck(): String = meterRegistry.withMetrics("blob.healthcheck") {
        TODO("Not yet implemented")
    }

    override fun getDefaultBucket(): String = azureConfig.blob.container ?: "N/A"

    override fun list(container: String, maxNumber: Int, prefix: String?): List<String> =
        meterRegistry.withMetrics("blob.list") {
            TODO("Not yet implemented")
        }

    override fun list(maxNumber: Int, prefix: String?): List<String> =
        azureConfig.blob.container.validateFor(VAR_CONTAINER) { list(it, maxNumber, prefix) }

    override fun listFolders(container: String): List<String> = meterRegistry.withMetrics("blob.listFolders") {
        TODO("Not yet implemented")
    }

    override fun listFolders(): List<String> =
        azureConfig.blob.container.validateFor(VAR_CONTAINER) { listFolders(it) }

    override fun getFileContent(container: String, fileName: String): String =
        meterRegistry.withMetrics("blob.getFileContent") {
            val blobContainerClient = blobServiceClient.getBlobContainerClient(container)
            val blobClient = blobContainerClient.getBlobClient(fileName)
            val input = blobClient.openInputStream() as InputStream
            val inputStream = InputStreamReader(input, StandardCharsets.UTF_8)
            val s = Scanner(inputStream).useDelimiter("\\A")
            if (s.hasNext()) s.next() else ""
        }

    override fun getFile(fileName: String): CloudFile = azureConfig.blob.container.validateFor(VAR_CONTAINER) {
        getFile(it, fileName)
    }

    override fun getFileContent(fileName: String): String =
        azureConfig.blob.container.validateFor(VAR_CONTAINER) { getFileContent(it, fileName) }

    override fun getFileContentAsInputStream(container: String, fileName: String): InputStream =
        meterRegistry.withMetrics("blob.getFileContentAsInputStream") {
            TODO("Not yet implemented")
        }

    override fun getFileContentAsInputStream(fileName: String): InputStream =
        azureConfig.blob.container.validateFor(VAR_CONTAINER) { getFileContentAsInputStream(it, fileName) }

    override fun getMetadata(container: String, fileName: String, urlDecode: Boolean): Map<String, String> =
        meterRegistry.withMetrics("blob.getMetadata") {
            runCatching {
                getProperties(container, fileName).let {
                    mapOf("last_modified" to it.lastModified.toString()).plus(
                        if (urlDecode) it.metadata.decode() else it.metadata
                    )
                }
            }.onFailure {
                logger.error(
                    "Failed to get MetaData for fileName: {} in bucket: {}. Exception: {}", fileName, container, it
                )
            }.getOrThrow()
        }

    override fun getMetadata(fileName: String, urlDecode: Boolean): Map<String, String> =
        azureConfig.blob.container.validateFor(VAR_CONTAINER) { getMetadata(it, fileName, urlDecode) }

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
        azureConfig.blob.container.validateFor(VAR_CONTAINER) {saveFile(it, fileName, content, metadata, contentType)}


    override fun saveFile(
        fileName: String,
        content: InputStream,
        size: Long,
        metadata: Map<String, String>?,
        contentType: String
    ) = azureConfig.blob.container.validateFor(VAR_CONTAINER) {saveFile(it, fileName, content, size, metadata, contentType)}

    override fun deleteFile(container: String, fileName: String): Int = meterRegistry.withMetrics("blob.deleteFile") {
        TODO("Not yet implemented")
    }

    override fun deleteFile(fileName: String): Int =
        azureConfig.blob.container.validateFor(VAR_CONTAINER) { deleteFile(it, fileName) }

    fun getProperties(container: String, key: String): BlobProperties {
        val blobContainerClient = blobServiceClient.getBlobContainerClient(container)
        val blobClient = blobContainerClient.getBlobClient(key)
        return blobClient.properties
    }

}
