package gov.cdc.ncezid.cloud.messaging

data class CloudMessage(
    val id: String,
    val recipientHandle: String,
    val body: String,
    val queue: String
) {
    override fun toString(): String {
        return """CloudMessage(
            |  id='$id', 
            |  recipientHandle='$recipientHandle', 
            |  body='$body', 
            |  queue='$queue'
            |)""".trimMargin()
    }
}
