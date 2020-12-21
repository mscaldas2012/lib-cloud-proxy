package gov.cdc.ncezid.cloud.storage

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
internal class CloudStorageProxyTest {
    @Inject
    lateinit var proxy: CloudStorageProxy
    @Test
    fun testProxy() {
        println(proxy.cloudEnv)
        println(proxy.storage.javaClass.name)
    }
}