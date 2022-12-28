package com.example.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appnews.API.RetrofitHelper
import com.example.appnews.API.NewsAPI

class CreateNews : AppCompatActivity() {

    val apiKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imt2dW50c3RvY3Z0Y3pyanJmaXJnIiwicm9sZSI6ImFub24iLCJpYXQiOjE2NzA5MTUxNTUsImV4cCI6MTk4NjQ5MTE1NX0.dNC2zK9GYo5lIpmqEWPg4lz1rB3YqW7_qqRJiIRTnY0"
    val token = "Bearer $apiKey"

    val NewsAPI = RetrofitHelper.getInstance().create(NewsAPI::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
