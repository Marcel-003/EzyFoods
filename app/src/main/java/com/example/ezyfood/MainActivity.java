package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button drinksBtn, snacksBtn, foodsBtn, topupBtn, mapBtn;
    int balance;
    TextView txtBalance;
    public static ArrayList<Order> listOrder = new ArrayList<Order>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinksBtn = findViewById(R.id.drinksBtn);
        snacksBtn = findViewById(R.id.snacksBtn);
        foodsBtn = findViewById(R.id.foodsBtn);
        topupBtn = findViewById(R.id.topupBtn);
        txtBalance = findViewById(R.id.balanceTxt);
        mapBtn = findViewById(R.id.mapBtn);

        Intent i2 = getIntent();
        balance = i2.getIntExtra("balance", 0);
        txtBalance.setText("Balance " + balance);
        i2.putExtra("balance", balance);
    }


    public void drinkMenu(View v)
    {
        Intent i = new Intent(MainActivity.this, Drinks.class);
        startActivity(i);
    }

    public void myorderMenu(View v)
    {
        Intent i = new Intent(MainActivity.this, MyOrder.class);

        startActivity(i);
    }

    public void foodsMenu(View view) {
        Intent i = new Intent(MainActivity.this, Foods.class);
        startActivity(i);
    }

    public void snacksMenu(View view) {
        Intent i = new Intent(MainActivity.this, Snacks.class);
        startActivity(i);
    }

    public void top_upMenu(View view) {
        Intent i = new Intent(MainActivity.this, TopUp.class);
        startActivity(i);
    }

    public void mapMenu(View view) {
        Intent i = new Intent(MainActivity.this, Map.class);
        startActivity(i);
    }
}