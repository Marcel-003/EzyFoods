package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TopUp extends AppCompatActivity {

    TextView balance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);

        balance = findViewById(R.id.balanceTxt);
    }



    public void top_up(View view) {
        int balance_topUp = Integer.parseInt(balance.getText().toString());

        Intent i = new Intent(TopUp.this, MainActivity.class);
        i.putExtra("balance", balance_topUp);
        startActivity(i);
    }
}