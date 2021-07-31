package com.juaracoding.ujianandroid.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Responses {
    @SerializedName("statuCode")
    private int statusCode;
    @SerializedName("pesan")
    private String pesan;
    @SerializedName("data")
    private List<Product> data;
}
