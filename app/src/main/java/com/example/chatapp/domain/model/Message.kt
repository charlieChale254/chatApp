package com.example.chatapp.domain.model

import java.util.*

data class Message(
    val text: String,
    val username: String,
    val formattedTime: String
)
