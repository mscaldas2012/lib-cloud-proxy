package gov.cdc.ncezid.cloud.storage

import gov.cdc.ncezid.cloud.aws.S3Proxy
import gov.cdc.ncezid.cloud.SUPPORTED_CLOUDS
import gov.cdc.ncezid.cloud.azure.BlobProxy
import io.micronaut.context.ApplicationContext
import io.micronaut.context.annotation.Property
import io.micronaut.discovery.event.ServiceReadyEvent
import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.scheduling.annotation.Async
import org.slf4j.LoggerFactory
import java.io.InputStream
import javax.inject.Singleton

@Singleton
open class CloudStorageProxy(@Property(name= "cloud_environment") val cloudEnv: String): CloudStorage {
    companion object {
        val logger = LoggerFactory.getLogger(CloudStorageProxy::class.java)
    }

    lateinit var storage: CloudStorage

    @Async
    @EventListener
    open fun registerHook(event: ServiceReadyEvent) {
//    init {
        setupStorage()
    }

    fun setupStorage() {
        logger.info("Deploying on Cloud  $cloudEnv")
        val cloudEnum = SUPPORTED_CLOUDS.valueOf(cloudEnv)
        ApplicationContext.run().use { context ->
            storage = when (cloudEnum) {
                SUPPORTED_CLOUDS.AWS -> context.getBean(S3Proxy::class.java)
                SUPPORTED_CLOUDS.AZURE -> context.getBean(BlobProxy::class.java)
            }
            logger.info("created storage interface using bean = ${storage}")
        }
    }

    override fun list(bucket: String, maxNumber: Int, prefix: String?): List<String> {
        return storage.list(bucket, maxNumber, prefix)
    }

    override fun listFolders(bucket: String): List<String> {
        return storage.listFolders(bucket)
    }

    override fun getFileContent(bucket: String, fileName: String): String {
        return storage.getFileContent(bucket, fileName)
    }

    override fun getFileContentAsInputStream(bucket: String, fileName: String): InputStream {
        return storage.getFileContentAsInputStream(bucket, fileName)
    }

    override fun getMetadata(bucket: String, fileName: String): Map<String, String> {
        return storage.getMetadata(bucket, fileName)
    }

    override fun saveFile(bucket: String, fileName: String, content: String, metadata: Map<String, String>?, contentType: String) {
        return storage.saveFile(bucket, fileName, content, metadata, contentType)
    }

    override fun saveFile(bucket: String, fileName: String, content: InputStream, size: Long, metadata: Map<String, String>?, contentType: String) {
        return storage.saveFile(bucket, fileName, content, size, metadata, contentType)
    }

    override fun deleteFile(bucket: String, fileName: String): Int {
        return storage.deleteFile(bucket, fileName)
    }

}