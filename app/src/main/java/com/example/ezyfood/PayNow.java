package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PayNow extends AppCompatActivity {

    MainActivity main = new MainActivity();
    TextView totalPrice;
    RecyclerView rvOrder;
    PayAdapter adapter;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_now);


        totalPrice = findViewById(R.id.totalPrice);

        for(int i = 0; i< main.listOrder.size(); i++)
        {
            price += ( main.listOrder.get(i).price ) *  ( main.listOrder.get(i).qty );
        }

        totalPrice.setText("Total Price Rp " + price);


        rvOrder = findViewById(R.id.rvOrder);
        rvOrder.setLayoutManager(new LinearLayoutManager(this));

        adapter = new PayAdapter(this, main.listOrder);
        rvOrder.setAdapter(adapter);
    }

    public void mainMenuBtn(View v)
    {
        MainActivity main = new MainActivity();
        Intent i = new Intent(PayNow.this, MainActivity.class);
        main.listOrder.clear();
        startActivity(i);
    }
}