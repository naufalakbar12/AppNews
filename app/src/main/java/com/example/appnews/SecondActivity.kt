package com.example.appnews

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.appnews.API.NewsAPI
import com.example.appnews.API.RetrofitHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    lateinit var etText: TextView
    lateinit var etMenuTop: LinearLayout
    lateinit var daftarberita: RecyclerView

    val apiKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imt2dW50c3RvY3Z0Y3pyanJmaXJnIiwicm9sZSI6ImFub24iLCJpYXQiOjE2NzA5MTUxNTUsImV4cCI6MTk4NjQ5MTE1NX0.dNC2zK9GYo5lIpmqEWPg4lz1rB3YqW7_qqRJiIRTnY0"
    val token = "Bearer $apiKey"

    var items = ArrayList<com.example.appnews.Model>()
    val NewsAPI = RetrofitHelper.getInstance().create(NewsAPI::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()

        etText = findViewById(R.id.judul)
        etMenuTop = findViewById(R.id.lay_MenuTop)
        daftarberita = findViewById(R.id.rcv_daftarberita)

        CoroutineScope(Dispatchers.Main).launch {
            val response = NewsAPI.get(token=token, apiKey = apiKey)

            response.body()?.forEach {
                items.add(
                    Model(
                        Id=it.id,
                        Title = it.title,
                        Description = it.description
                    )
                )


            }
        }
    }
}