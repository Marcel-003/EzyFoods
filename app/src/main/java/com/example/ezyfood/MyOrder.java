package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {

    MainActivity main = new MainActivity();
    TextView totalPrice;
    RecyclerView rvOrder;
    OrderAdapter adapter;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);


        totalPrice = findViewById(R.id.totalPrice);

        for(int i = 0; i< main.listOrder.size(); i++)
        {
            price += ( main.listOrder.get(i).price ) *  ( main.listOrder.get(i).qty );
        }

        totalPrice.setText("Total Price Rp " + price);


        rvOrder = findViewById(R.id.rvOrder);
        rvOrder.setLayoutManager(new LinearLayoutManager(this));

        adapter = new OrderAdapter(this, main.listOrder);
        rvOrder.setAdapter(adapter);

    }

    public void paynowBtn(View v)
    {
        Intent i = new Intent(MyOrder.this, PayNow.class);
        startActivity(i);
    }
}