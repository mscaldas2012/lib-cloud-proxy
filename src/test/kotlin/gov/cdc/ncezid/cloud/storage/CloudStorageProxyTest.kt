package gov.cdc.ncezid.cloud.storage

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
internal class CloudStorageProxyTest {

    @Inject
    lateinit var cloudStorage: CloudStorage

    @Test
    fun listFolders() {
//        val configs = s3Proxy.listFolders("cf-daart-hl7-dropbucket-dev")
        val configs = cloudStorage.listFolders("cf-daart-nist-profiles-dev")
//        val configs = cloudStorage.list("foodnet", 100)
        configs.forEach { println("Folder: $it")}
        if (configs.isEmpty()) {
            println("NO FOLDERS FOUND ON THIS BUCKET!")
        }
    }
}