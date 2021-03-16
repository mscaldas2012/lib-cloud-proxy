package gov.cdc.ncezid.cloud.storage

data class CloudFile(
    val bucket: String,
    val fileName: String,
    val metadata: Map<String, String>,
    val content: String
) {
    override fun toString(): String {
        return """
            |CloudFile(
            |  bucket='$bucket', 
            |  fileName='$fileName', 
            |  metadata=$metadata, 
            |  content='${content.take(100)}...${content.drop(100)}'
            |)""".trimMargin()
    }
}
