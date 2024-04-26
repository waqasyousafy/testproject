package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Name {

   @SerializedName("common")
   String common;

   @SerializedName("official")
   String official;

   @SerializedName("nativeName")
   NativeName    nativeName;


    public void setCommon(String common) {
        this.common = common;
    }
    public String getCommon() {
        return common;
    }
    
    public void setOfficial(String official) {
        this.official = official;
    }
    public String getOfficial() {
        return official;
    }
    
    public void setNativeName(NativeName nativeName) {
        this.nativeName = nativeName;
    }
    public NativeName getNativeName() {
        return nativeName;
    }
    
}