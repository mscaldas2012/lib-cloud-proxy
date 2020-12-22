package gov.cdc.ncezid.cloud.storage

import gov.cdc.ncezid.cloud.aws.S3Proxy
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import javax.inject.Inject

@MicronautTest
internal class CloudStorageProxyTest {

    @Inject
    lateinit var s3Proxy: S3Proxy
    @Inject
    lateinit var proxy: CloudStorageProxy

    @Test
    fun listFolders() {
//        val configs = s3Proxy.listFolders("cf-daart-hl7-dropbucket-dev")
        val configs = s3Proxy.listFolders("cf-daart-nist-profiles-dev")
        configs.forEach { println(it)}
        if (configs.size == 0) {
            println("NO FOLDERS FOUND ON THIS BUCKET!")
        }
        proxy.setupStorage()
        val configsProxy = proxy.listFolders("cf-daart-nist-profiles-dev")
        configsProxy.forEach { println(it)}
    }
}