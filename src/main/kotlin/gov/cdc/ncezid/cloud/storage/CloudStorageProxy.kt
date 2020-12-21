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

    override fun list(folder: String): List<String> {
        return storage.list(folder)
    }

    override fun listFolders(): List<String> {
        return storage.listFolders()
    }

    override fun getFileContent(objectKey: String): String {
        return storage.getFileContent(objectKey)
    }

    override fun getFileContentAsInputStream(objectKey: String): InputStream {
        return storage.getFileContentAsInputStream(objectKey)
    }

    override fun getMetadata(objectKey: String): Map<String, String> {
        return storage.getMetadata(objectKey)
    }

    override fun saveFile(objectKey: String, metadata: Map<String, String>, message: String) {
        return storage.saveFile(objectKey, metadata, message)
    }

    override fun saveFile(objectKey: String, message: String) {
        return storage.saveFile(objectKey, message)
    }

    override fun deleteFile(key: String): Int {
        return storage.deleteFile(key)
    }
}