package com.example.android1splashscreenandgame.data.models;

import java.io.Serializable;

public class NameModel implements Serializable {
    private String name;
    private int image;
    String address;


    public NameModel(String name,int image,String address) {
        this.name = name;
        this.image = image;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getImage() {
        return image;
    }
    public String getAddress() {
        return address;
    }

}
