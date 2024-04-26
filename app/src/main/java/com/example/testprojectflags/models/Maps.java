package com.example.testprojectflags.models;

import com.google.gson.annotations.SerializedName;

   
public class Maps {

   @SerializedName("googleMaps")
   String googleMaps;

   @SerializedName("openStreetMaps")
   String openStreetMaps;


    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }
    public String getGoogleMaps() {
        return googleMaps;
    }
    
    public void setOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
    }
    public String getOpenStreetMaps() {
        return openStreetMaps;
    }
    
}