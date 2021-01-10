package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Foods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
    }

    public void myorderMenu(View v)
    {
        Intent i = new Intent(Foods.this, MyOrder.class);
        startActivity(i);
    }

    public void cilorMenu(View view) {
        Intent i = new Intent(Foods.this, OrderMenu.class);
        i.putExtra("nameOrder", "Cilor");
        i.putExtra("hargaOrder", 3000);
        i.putExtra("flag", 3);
        startActivity(i);
    }

    public void batagorMenu(View view) {
        Intent i = new Intent(Foods.this, OrderMenu.class);
        i.putExtra("nameOrder", "Batagor");
        i.putExtra("hargaOrder", 7000);
        i.putExtra("flag", 3);
        startActivity(i);
    }

    public void siomayMenu(View view) {
        Intent i = new Intent(Foods.this, OrderMenu.class);
        i.putExtra("nameOrder", "Siomay");
        i.putExtra("hargaOrder", 9000);
        i.putExtra("flag", 3);
        startActivity(i);
    }

    public void cimolMenu(View view) {
        Intent i = new Intent(Foods.this, OrderMenu.class);
        i.putExtra("nameOrder", "Cimol");
        i.putExtra("hargaOrder", 2000);
        i.putExtra("flag", 3);
        startActivity(i);
    }
}