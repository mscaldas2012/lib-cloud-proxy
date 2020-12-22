package gov.cdc.ncezid.cloud.azure

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("azure")
class AzureConfig {
    lateinit var blob_connectStr: String
}
