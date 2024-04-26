package com.example.testprojectflags.models;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class CapitalInfo {

   @SerializedName("latlng")
   List<Double> latlng;


    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }
    public List<Double> getLatlng() {
        return latlng;
    }
    
}