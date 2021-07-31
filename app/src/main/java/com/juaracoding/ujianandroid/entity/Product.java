package com.juaracoding.ujianandroid.entity;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    private long id;
    @SerializedName("product")
    private String product;
    @SerializedName("price")
    private long price;
    @SerializedName("decription")
    private String description;
    @SerializedName("variant")
    private String variant;

    public Product(long id, String product, long price, String description, String variant) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.description = description;
        this.variant = variant;
    }

    public Product(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }
}
