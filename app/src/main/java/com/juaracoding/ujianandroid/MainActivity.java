package com.juaracoding.ujianandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juaracoding.ujianandroid.adapter.ProductAdapter;
import com.juaracoding.ujianandroid.entity.Product;
import com.juaracoding.ujianandroid.service.ApiClient;
import com.juaracoding.ujianandroid.service.ProductInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

private RecyclerView rcvProduct;
private ProductAdapter productAdapter;
private ArrayList<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvProduct= findViewById(R.id.rcv_product);



        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(MainActivity.this);
        rcvProduct.setLayoutManager(layoutManager);


        List<Product> productList;

        ProductInterface productInterface = ApiClient.getRetrofit().create(ProductInterface.class);
        Call<List<Product>> call = productInterface.getAllProduct();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                productAdapter= new ProductAdapter(productArrayList, getApplicationContext());
                rcvProduct.setAdapter(productAdapter);
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                System.out.println(("error"));
            }
        });
    }
}
