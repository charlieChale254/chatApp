package com.example.chatapp.data.remote.dto

import com.example.chatapp.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.*

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val id: String,
    val username: String
){
    fun toMessage(): Message {
        val date = Date(timestamp)
        val formattedDate = DateFormat
            .getDateInstance(DateFormat.DEFAULT)
            .format(date)

        return Message(text = text,
            formattedTime = formattedDate,
            username = username )
    }
}
