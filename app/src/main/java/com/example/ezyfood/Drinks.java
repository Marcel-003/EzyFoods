package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    public void myorderMenu(View v)
    {
        Intent i = new Intent(Drinks.this, MyOrder.class);
        startActivity(i);
    }

    public void airMenu(View view) {
        Intent i = new Intent(Drinks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Air Mineral");
        i.putExtra("hargaOrder", 2000);
        i.putExtra("flag", 1);
        startActivity(i);
    }

    public void apelMenu(View view) {
        Intent i = new Intent(Drinks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Jus Apel");
        i.putExtra("hargaOrder", 7000);
        i.putExtra("flag", 1);
        startActivity(i);
    }

    public void manggaMenu(View view) {
        Intent i = new Intent(Drinks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Jus Mangga");
        i.putExtra("hargaOrder", 8000);
        i.putExtra("flag", 1);
        startActivity(i);
    }

    public void alpukatMenu(View view) {
        Intent i = new Intent(Drinks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Jus Alpukat");
        i.putExtra("hargaOrder", 10000);
        i.putExtra("flag", 1);
        startActivity(i);
    }
}