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
        s3Proxy.listFolders()
//        proxy.setupStorage()
//        proxy.listFolders()
    }
}