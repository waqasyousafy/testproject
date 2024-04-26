package com.example.testprojectflags

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testprojectflags.country.Country
import com.example.testprojectflags.country.CountryPickerAdapter
import com.example.testprojectflags.country.selectedCountry
import com.example.testprojectflags.databinding.ActivityCountriesBinding
import java.util.Collections

class CountriesActivity : AppCompatActivity(), Comparator<Country> {
    private lateinit var binding: ActivityCountriesBinding
    var countrylist = mutableListOf<Country>()
    var adapter: CountryPickerAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        countrylist = Country.entries.toMutableList()
        Collections.sort(countrylist, this)

        adapter = CountryPickerAdapter(this, countrylist)
        binding?.countrieslist?.adapter = adapter
        selectedCountry = {
            startActivity(
                Intent(
                    this@CountriesActivity,
                    MainActivity::class.java
                ).putExtra("country", it)
            )
        }


    }

    override fun compare(p0: Country?, p1: Country?): Int {
        return p1?.getName(this@CountriesActivity)
            ?.let { p0?.getName(this@CountriesActivity)?.compareTo(it) }!!
    }
}