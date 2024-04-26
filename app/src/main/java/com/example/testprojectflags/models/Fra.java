package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Fra {

   @SerializedName("f")
   String f;

   @SerializedName("m")
   String m;


    public void setF(String f) {
        this.f = f;
    }
    public String getF() {
        return f;
    }
    
    public void setM(String m) {
        this.m = m;
    }
    public String getM() {
        return m;
    }
    
}