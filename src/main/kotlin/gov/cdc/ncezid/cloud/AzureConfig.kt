package gov.cdc.ncezid.cloud

import io.micronaut.context.annotation.ConfigurationBuilder
import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("azure")
class AzureConfig {

    @ConfigurationBuilder(configurationPrefix = "blob")
    val blob: BlobConfig = BlobConfig()

    @ConfigurationBuilder(configurationPrefix = "blob.health")
    val blobHealth: HealthConfig = HealthConfig()

    inner class BlobConfig {
        var container: String? = null
        var connectStr: String? = null

        override fun toString(): String {
            return "container='$container', connectStr='$connectStr', health=${blobHealth.enabled}"
        }
    }

    class HealthConfig {
        var enabled: Boolean = false
    }

    override fun toString(): String {
        return """
            |AzureConfig(
            |  blob='[$blob]'
            |)""".trimMargin()
    }

}
