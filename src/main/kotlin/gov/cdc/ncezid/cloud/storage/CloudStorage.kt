package gov.cdc.ncezid.cloud.storage

import io.micronaut.http.MediaType
import java.io.InputStream

/**
 *
 *
 * @Created - 9/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
interface CloudStorage {
    fun list(bucket: String, maxNumber: Int, prefix: String? = null): List<String>
    fun list(maxNumber: Int, prefix: String? = null): List<String>
    fun listFolders(bucket: String): List<String>
    fun listFolders(): List<String>
    fun getFileContent(bucket: String, fileName: String): String
    fun getFileContent(fileName: String): String
    fun getFileContentAsInputStream(bucket: String, fileName: String): InputStream
    fun getFileContentAsInputStream(fileName: String): InputStream
    fun getMetadata(bucket: String, fileName: String, urlDecode: Boolean = true): Map<String, String>
    fun getMetadata(fileName: String, urlDecode: Boolean = true): Map<String, String>

    fun saveFile(bucket: String, fileName: String, content:String, metadata: Map<String, String>? = null, contentType: String = MediaType.TEXT_PLAIN)
    fun saveFile(bucket: String, fileName: String, content:InputStream, size: Long, metadata: Map<String, String>?, contentType: String = MediaType.TEXT_PLAIN,)
    fun saveFile(fileName: String, content:String, metadata: Map<String, String>? = null, contentType: String = MediaType.TEXT_PLAIN)
    fun saveFile(fileName: String, content:InputStream, size: Long, metadata: Map<String, String>?, contentType: String = MediaType.TEXT_PLAIN,)
    fun deleteFile(bucket:String, fileName: String): Int
    fun deleteFile(fileName: String): Int

    fun healthCheck(): String
}

