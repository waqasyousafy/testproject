package com.example.testprojectflags.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.testprojectflags.models.ExampleJson2KtPOJO
import com.example.testprojectflags.repo.DataRepository

class DataViewModel(private val repository: DataRepository) : ViewModel() {

    fun fetchData(nameCountry: String?): LiveData<List<ExampleJson2KtPOJO>> {
        return repository.fetchData(nameCountry)
    }
}
