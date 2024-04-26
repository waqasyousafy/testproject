package com.example.testprojectflags.retrofit

import com.example.testprojectflags.models.ExampleJson2KtPOJO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("v3.1/name/{nameCountry}")
    fun fetchData(@Path("nameCountry") nameCountry: String?): Call<List<ExampleJson2KtPOJO>>
}