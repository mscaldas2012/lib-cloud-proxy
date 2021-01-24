package gov.cdc.ncezid.cloud.messaging

interface CloudMessaging {
    fun listQueues(vararg prefixes: String): List<String>
    fun getQueueUrl(queueName: String): String
    fun getQueueUrl(): String
    fun receiveMessage(): List<CloudMessage>
    fun receiveMessage(queueName: String): List<CloudMessage>
    fun deleteMessage(message: CloudMessage): String
    fun timeoutMessage(message: CloudMessage, timeout: Int): String

    fun healthCheck(): String
}