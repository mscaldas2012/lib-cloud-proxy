package gov.cdc.ncezid.cloud.messaging.azure

import gov.cdc.ncezid.cloud.messaging.CloudMessage

class ASQMessage (
    id: String,
    recipientHandle: String,
    body: String,
    queue: String
) : CloudMessage(id, recipientHandle, body, queue) {

    override fun key(): String {
        TODO("Not yet implemented")
    }
}