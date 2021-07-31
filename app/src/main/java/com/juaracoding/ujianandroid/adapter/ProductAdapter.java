package com.juaracoding.ujianandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.juaracoding.ujianandroid.R;
import com.juaracoding.ujianandroid.entity.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<Product> dataList;
    private Context context;

    public ProductAdapter(ArrayList<Product> dataList, Context context) {
        this.dataList = dataList;
        this.context=context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductAdapter.ProductViewHolder holder, int position) {
        holder.txtProduct.setText(dataList.get(position).getProduct());
        holder.txtPrice.setText(dataList.get(position).getPrice());
        holder.txtDesc.setText(dataList.get(position).getDescription());
        holder.txtVar.setText(dataList.get(position).getVariant());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView txtProduct, txtPrice, txtDesc, txtVar;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProduct= itemView.findViewById(R.id.txtProduct);
            txtPrice= itemView.findViewById(R.id.txtPrice);
            txtDesc= itemView.findViewById(R.id.txtDesc);
            txtVar= itemView.findViewById(R.id.txtVar);
        }

    }
}
