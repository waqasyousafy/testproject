package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Languages {

   @SerializedName("eng")
   String eng;

   @SerializedName("urd")
   String urd;


    public void setEng(String eng) {
        this.eng = eng;
    }
    public String getEng() {
        return eng;
    }
    
    public void setUrd(String urd) {
        this.urd = urd;
    }
    public String getUrd() {
        return urd;
    }
    
}