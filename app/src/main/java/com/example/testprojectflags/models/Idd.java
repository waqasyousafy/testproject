package com.example.testprojectflags.models;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Idd {

   @SerializedName("root")
   String root;

   @SerializedName("suffixes")
   List<String> suffixes;


    public void setRoot(String root) {
        this.root = root;
    }
    public String getRoot() {
        return root;
    }
    
    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }
    public List<String> getSuffixes() {
        return suffixes;
    }
    
}