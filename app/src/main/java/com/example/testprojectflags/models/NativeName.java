package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class NativeName {

   @SerializedName("eng")
   Eng eng;

   @SerializedName("urd")
   Urd urd;


    public void setEng(Eng eng) {
        this.eng = eng;
    }
    public Eng getEng() {
        return eng;
    }
    
    public void setUrd(Urd urd) {
        this.urd = urd;
    }
    public Urd getUrd() {
        return urd;
    }
    
}