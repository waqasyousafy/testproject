package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Ita {

   @SerializedName("official")
   String official;

   @SerializedName("common")
   String common;


    public void setOfficial(String official) {
        this.official = official;
    }
    public String getOfficial() {
        return official;
    }
    
    public void setCommon(String common) {
        this.common = common;
    }
    public String getCommon() {
        return common;
    }
    
}