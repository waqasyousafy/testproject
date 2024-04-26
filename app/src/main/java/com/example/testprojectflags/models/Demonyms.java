package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Demonyms {

   @SerializedName("eng")
   Eng eng;

   @SerializedName("fra")
   Fra fra;


    public void setEng(Eng eng) {
        this.eng = eng;
    }
    public Eng getEng() {
        return eng;
    }
    
    public void setFra(Fra fra) {
        this.fra = fra;
    }
    public Fra getFra() {
        return fra;
    }
    
}