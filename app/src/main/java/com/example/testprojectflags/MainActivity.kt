package com.example.testprojectflags

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testprojectflags.databinding.ActivityMainBinding
import com.example.testprojectflags.repo.DataRepository
import com.example.testprojectflags.retrofit.RetrofitClient.apiService
import com.example.testprojectflags.viewmodel.DataViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var dataViewModel: DataViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var nameCountry = intent.getStringExtra("country")

        dataViewModel = ViewModelProvider(
            this,
            DataViewModelFactory(DataRepository())
        ).get(DataViewModel::class.java)
        binding?.toolbar?.bckbtn?.setOnClickListener {
            finish()
        }
        binding?.toolbar?.bckbtn?.setOnClickListener {
            finish()
        }
        dataViewModel?.fetchData(nameCountry)?.observe(this, Observer { dataResponse ->
            // Update UI with dataResponse
            var obj = dataResponse?.get(0)
            Log.e("TAG", "mainactivity: ${dataResponse?.get(0)?.name?.common}")
            binding?.toolbar?.title?.text = obj?.name?.common
            binding?.commonname?.text = getString(R.string.common_name) + obj?.name?.common
            binding?.officialname?.text = "Official Name : " + obj?.name?.official
            binding?.name?.text = "Native Name:"


        })


    }

}