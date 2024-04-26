package com.example.testprojectflags.models;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Car {

   @SerializedName("signs")
   List<String> signs;

   @SerializedName("side")
   String side;


    public void setSigns(List<String> signs) {
        this.signs = signs;
    }
    public List<String> getSigns() {
        return signs;
    }
    
    public void setSide(String side) {
        this.side = side;
    }
    public String getSide() {
        return side;
    }
    
}