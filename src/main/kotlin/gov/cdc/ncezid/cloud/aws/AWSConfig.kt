package gov.cdc.ncezid.cloud.aws

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("aws")
class AWSConfig {
    lateinit var region: String
    lateinit var bucket: String
}

