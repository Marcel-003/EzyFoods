package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Snacks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
    }

    public void doritosMenu(View view) {
        Intent i = new Intent(Snacks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Doritos");
        i.putExtra("hargaOrder", 9000);
        i.putExtra("flag", 2);
        startActivity(i);
    }

    public void chitatoMenu(View view) {
        Intent i = new Intent(Snacks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Chitato");
        i.putExtra("hargaOrder", 7000);
        i.putExtra("flag", 2);
        startActivity(i);
    }

    public void taroMenu(View view) {
        Intent i = new Intent(Snacks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Taro");
        i.putExtra("hargaOrder", 4000);
        i.putExtra("flag", 2);
        startActivity(i);
    }

    public void laysMenu(View view) {
        Intent i = new Intent(Snacks.this, OrderMenu.class);
        i.putExtra("nameOrder", "Lays");
        i.putExtra("hargaOrder", 10000);
        i.putExtra("flag", 2);
        startActivity(i);
    }

    public void myorderMenu(View view) {
        Intent i = new Intent(Snacks.this, MyOrder.class);
        startActivity(i);
    }
}