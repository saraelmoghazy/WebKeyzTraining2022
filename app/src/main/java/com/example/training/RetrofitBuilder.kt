package com.example.training

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {

    companion object {
        fun getInstance(): Retrofit {
            return Retrofit.Builder().baseUrl("https://quotable.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}