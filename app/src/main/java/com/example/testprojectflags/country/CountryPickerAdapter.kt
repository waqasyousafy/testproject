package com.example.testprojectflags.country

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testprojectflags.R
import java.util.*
import kotlin.collections.ArrayList

var selectedCountry: ((String) -> Unit)? = null

class CountryPickerAdapter(private val context: Context, countriesgot: List<Country>) :
    RecyclerView.Adapter<CountryPickerAdapter.ViewHolder>() {

    private var filteredCountries: List<Country> = ArrayList()
    private var countries: List<Country> = ArrayList()

    init {
        this.countries = countriesgot
        this.filteredCountries = countriesgot
    }


    private fun replaceItems(countries: List<Country>) {
        countries.sorted()
        this.countries = countries
        filteredCountries = countries
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.countriitme, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = getItem(position)
        context?.let {
            holder.bindData(country, context)
        }
        holder?.favIcon?.setOnClickListener {
            if (country?.isFav == true) {
                country?.isFav = false
                holder?.favIcon?.setImageResource(R.drawable.emptyheart)
            } else {
                country?.isFav = true
                holder?.favIcon?.setImageResource(R.drawable.filledheart)
            }
        }
        holder.itemView.setOnClickListener {
            // Handle item click here
            selectedCountry?.invoke(country.getName(context))
        }

    }

    override fun getItemCount(): Int {
        return if (countries.isEmpty()) 1 else countries.size
    }


    private fun getItem(index: Int): Country {
        return countries[index]
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        public var flags: ImageView? = null
        public var favIcon: ImageView? = null
        public var namecountry: TextView? = null

        init {
            flags = itemView.findViewById(R.id.flag)
            namecountry = itemView.findViewById(R.id.nameCountry)
            favIcon = itemView.findViewById(R.id.fav)

        }

        fun bindData(country: Country, context: Context) {
            flags?.setImageResource(country.getFlagDrawableRes(context))
            namecountry?.text = country.getName(context)
        }
    }
}
