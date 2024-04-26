package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class CoatOfArms {

   @SerializedName("png")
   String png;

   @SerializedName("svg")
   String svg;


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
    
}