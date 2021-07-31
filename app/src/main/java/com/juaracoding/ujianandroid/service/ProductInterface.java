package com.juaracoding.ujianandroid.service;

import com.juaracoding.ujianandroid.entity.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductInterface {

    @GET {"/product"}
    Call<List<Product>> getAllProduct();
}
