package com.example.messengerapp

data class Message(
    var messageText: String? = "",
    var sender: String? = "",
    var timestamp: Long = System.currentTimeMillis()
)