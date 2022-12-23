package com.example.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appnews.API.RetrofitHelper
import com.example.appnews.API.NewsAPI

class CreateNews : AppCompatActivity() {

    val apiKey = ""
    val token = "Bearer $apiKey"

    val NewsAPI = RetrofitHelper.getInstance().create(NewsAPI::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
