package com.example.appnews.API

data class NewsData (
    val title: String,
    val description: String? = null,
    val done_at: String? = null,
)