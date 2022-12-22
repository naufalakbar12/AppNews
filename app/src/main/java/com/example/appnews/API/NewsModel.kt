package com.example.appnews.API

data class NewsModel (
    val id: String,
    val title: String,
    val description: String? = null,
)
