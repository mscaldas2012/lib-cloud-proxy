package gov.cdc.ncezid.cloud.util

// TODO - this is general purpose and could be moved to a helper/util lib in the future...
fun <T, R> T?.validateFor(varName: String = "", block: (v: T) -> R): R {
    requireNotNull(this) { "Value provided for variable $varName was null" }
    return block(this)
}
