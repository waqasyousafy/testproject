package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class PKR {

   @SerializedName("name")
   String name;

   @SerializedName("symbol")
   String symbol;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }
    
}