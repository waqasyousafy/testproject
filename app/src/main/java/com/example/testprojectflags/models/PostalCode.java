package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class PostalCode {

   @SerializedName("format")
   String format;

   @SerializedName("regex")
   String regex;


    public void setFormat(String format) {
        this.format = format;
    }
    public String getFormat() {
        return format;
    }
    
    public void setRegex(String regex) {
        this.regex = regex;
    }
    public String getRegex() {
        return regex;
    }
    
}