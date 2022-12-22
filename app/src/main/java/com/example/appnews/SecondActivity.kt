package com.example.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.appnews.API.NewsAPI
import com.example.appnews.API.RetrofitHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    lateinit var tvw_TitleHeadline: TextView
    lateinit var tvw_DescHeadline : TextView
    lateinit var rcv_daftarberita: ScrollView

    val apiKey = ""
    val token = "Bearer $apiKey"

    var items = ArrayList<com.example.appnews.Model>()
    val NewsAPI = RetrofitHelper.getInstance().create(NewsAPI::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvw_TitleHeadline = findViewById(R.id.tvw_TitleHeadLine)
        tvw_DescHeadline = findViewById(R.id.tvw_DescHeadline)
        rcv_daftarberita = findViewById(R.id.rcv_daftarberita)

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