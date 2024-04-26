package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Currencies {

   @SerializedName("PKR")
   PKR PKR;


    public void setPKR(PKR PKR) {
        this.PKR = PKR;
    }
    public PKR getPKR() {
        return PKR;
    }
    
}