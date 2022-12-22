package com.example.appnews.API

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

public interface NewsAPI {
    @GET("/rest/v1/News?select=*")
    suspend fun get(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String
    ):
            Response<List<NewsModel>>

    @POST("/rest/v1/AppNews")
    suspend fun create(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Body NewsData: NewsData
    )
}
