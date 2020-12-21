package gov.cdc.ncezid.cloud.storage

import java.io.InputStream

/**
 *
 *
 * @Created - 9/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
interface CloudStorage {
    fun list(folder: String ): List<String>
    fun listFolders( ): List<String>
    @Throws
    fun getFileContent(objectKey: String): String
    fun getFileContentAsInputStream(objectKey: String): InputStream
    @Throws
    fun getMetadata(objectKey: String): Map<String, String>

    fun saveFile(objectKey: String, metadata: Map<String, String>, message: String)
    fun saveFile(objectKey: String, message: String)

    fun deleteFile(key: String): Int

}

