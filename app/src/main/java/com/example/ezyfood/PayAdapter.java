package com.example.ezyfood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PayAdapter extends RecyclerView.Adapter<com.example.ezyfood.PayAdapter.ViewHolder>{
    EditText totalPrice;
    MainActivity main = new MainActivity();
    Context ctx;
    public PayAdapter (Context ctx, ArrayList<Order> listOrder)
    {
        this.ctx = ctx;
        this.main.listOrder = listOrder;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemOrder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemOrder = itemView.findViewById(R.id.itemOrder);
        }
    }

    @NonNull
    @Override
    public com.example.ezyfood.PayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.pay_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.ezyfood.PayAdapter.ViewHolder holder, int position) {
        Order order = main.listOrder.get(position);
        String temp = order.name + "\n Quantity: " + order.qty + " x Rp " + order.price;
        holder.itemOrder.setText(temp);
    }

    @Override
    public int getItemCount() {
        return main.listOrder.size();
    }
}