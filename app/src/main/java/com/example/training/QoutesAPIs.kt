package com.example.training

import com.example.training.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QoutesAPIs {

    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}