package com.example.ezyfood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder>{
    EditText totalPrice;
    MainActivity main = new MainActivity();
    Context ctx;
    public OrderAdapter (Context ctx, ArrayList<Order> listOrder)
    {
        this.ctx = ctx;
        this.main.listOrder = listOrder;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemOrder;
        Button deleteBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemOrder = itemView.findViewById(R.id.itemOrder);
            deleteBtn = (Button) itemView.findViewById(R.id.deleteBtn);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.order_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Order order = main.listOrder.get(position);
        String temp = order.name + "\n Quantity: " + order.qty + " x Rp " + order.price;
        holder.itemOrder.setText(temp);

        holder.deleteBtn.setText("Hapus");
        holder.deleteBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int price = 0;
                main.listOrder.remove(position);

                Intent i = new Intent(ctx, MyOrder.class);
                ctx.startActivity(i);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return main.listOrder.size();
    }
}
