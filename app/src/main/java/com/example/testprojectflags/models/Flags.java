package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Flags {

   @SerializedName("png")
   String png;

   @SerializedName("svg")
   String svg;

   @SerializedName("alt")
   String alt;


    public void setPng(String png) {
        this.png = png;
    }
    public String getPng() {
        return png;
    }
    
    public void setSvg(String svg) {
        this.svg = svg;
    }
    public String getSvg() {
        return svg;
    }
    
    public void setAlt(String alt) {
        this.alt = alt;
    }
    public String getAlt() {
        return alt;
    }
    
}