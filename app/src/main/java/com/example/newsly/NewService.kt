package com.example.newsly

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


//http://newsapi.org/v2/top-headlines?country=ua&apiKey=854c9a7fd27a4d099704c0d596606e5e
//http://newsapi.org/v2/everything?q=apple&from=2020-10-01&to=2020-10-01&sortBy=popularity&apiKey=854c9a7fd27a4d099704c0d596606e5e

const val BASE_URL = "http://newsapi.org/"
const val API_KEY = "854c9a7fd27a4d099704c0d596606e5e"

interface NewInterface {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country") country: String, @Query("page") page: Int): Call<News>
    //http://newsapi.org/v2/top-headlines?apiKey=854c9a7fd27a4d099704c0d596606e5e&country=ua&page=1
}

object NewsService {
    val newsInstance: NewInterface

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        newsInstance = retrofit.create(NewInterface::class.java)
    }
}