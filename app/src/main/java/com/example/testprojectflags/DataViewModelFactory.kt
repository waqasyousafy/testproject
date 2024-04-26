package com.example.testprojectflags

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testprojectflags.repo.DataRepository
import com.example.testprojectflags.viewmodel.DataViewModel

class DataViewModelFactory(private val repository: DataRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DataViewModel::class.java)) {
            return DataViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
