package com.example.testprojectflags.repo

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.testprojectflags.models.ExampleJson2KtPOJO
import com.example.testprojectflags.retrofit.ApiService
import com.example.testprojectflags.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataRepository() {
    private val apiService = RetrofitClient.apiService
    fun fetchData(nameCountry: String?): LiveData<List<ExampleJson2KtPOJO>> {
        val data = MutableLiveData<List<ExampleJson2KtPOJO>>()
        apiService.fetchData(nameCountry).enqueue(object : Callback<List<ExampleJson2KtPOJO>> {
            override fun onResponse(
                call: Call<List<ExampleJson2KtPOJO>>,
                response: Response<List<ExampleJson2KtPOJO>>
            ) {
                if (response.isSuccessful) {
                    data.value = response.body()
                } else {
                    // Handle error response
                }
            }

            override fun onFailure(call: Call<List<ExampleJson2KtPOJO>>, t: Throwable) {
                // Handle network error

            }
        })
        return data
    }
}
