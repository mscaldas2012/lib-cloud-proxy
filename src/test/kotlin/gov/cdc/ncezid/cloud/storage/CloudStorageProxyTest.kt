package gov.cdc.ncezid.cloud.storage

import gov.cdc.ncezid.cloud.storage.aws.S3Proxy
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import javax.inject.Inject

@MicronautTest
internal class CloudStorageProxyTest {

//    @Inject
//    lateinit var s3Proxy: S3Proxy
    @Inject
    lateinit var cloudStorage: CloudStorage

    @Test
    fun listFolders() {
//        val configs = s3Proxy.listFolders("cf-daart-hl7-dropbucket-dev")
//        val configs = s3Proxy.listFolders("cf-daart-nist-profiles-dev")
        val configs = cloudStorage.list("foodnet", 100)
        configs.forEach { println("Folder: $it")}
        if (configs.isEmpty()) {
            println("NO FOLDERS FOUND ON THIS BUCKET!")
        }
//        val configsProxy = cloudStorage.listFolders("cf-daart-nist-profiles-dev")
//        configsProxy.forEach { println("Folder cs: $it")}
    }
}