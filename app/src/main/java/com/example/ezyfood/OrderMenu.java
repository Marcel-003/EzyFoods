package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderMenu extends AppCompatActivity {

    Button orderBtn;
    TextView itemOrder;
    EditText qtyTxt;
    MainActivity main = new MainActivity();

    String name;
    int price;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);

        Intent i = getIntent();
        name = i.getStringExtra("nameOrder");
        price = i.getIntExtra("hargaOrder", 0);
        flag = i.getIntExtra("flag", 0);

        itemOrder = findViewById(R.id.itemOrder);
        qtyTxt = findViewById(R.id.qtyTxt);
        orderBtn = findViewById(R.id.orderBtn);

        String temp = name + "\n Rp " + Integer.toString(price);

        itemOrder.setText(temp);
    }

    public void myorderMenu(View v)
    {
        Order order = new Order();
        Intent i = new Intent(OrderMenu.this, MyOrder.class);
        order.name = name;
        order.price = price;
        order.qty = Integer.parseInt(qtyTxt.getText().toString());
        main.listOrder.add(order);
        startActivity(i);
    }

    public void ordermoreBtn(View v)
    {

        Order order = new Order();
        Intent i;
        if(flag == 1)
        {
            i = new Intent(OrderMenu.this, Drinks.class);
        }
        else if(flag == 2)
        {
            i = new Intent(OrderMenu.this, Snacks.class);
        }
        else
        {
            i = new Intent(OrderMenu.this, Foods.class);
        }

        order.name = name;
        order.price = price;
        order.qty = Integer.parseInt(qtyTxt.getText().toString());
        main.listOrder.add(order);
        startActivity(i);
    }
}