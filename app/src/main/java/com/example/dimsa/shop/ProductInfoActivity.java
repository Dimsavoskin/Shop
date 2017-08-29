package com.example.dimsa.shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProductInfoActivity extends AppCompatActivity {

    TextView productTypeTV, nameTV, typeTV, specialInfoTV;
    String productType, name, type, specialInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        productTypeTV = (TextView) findViewById(R.id.productTV);
        nameTV = (TextView) findViewById(R.id.nameTV);
        typeTV = (TextView) findViewById(R.id.typeTV);
        specialInfoTV = (TextView) findViewById(R.id.specialInfoTV);

        Intent intent = getIntent();
        productType = intent.getStringExtra("productType");
        name = intent.getStringExtra("name");
        type = intent.getStringExtra("type");
        specialInfo = intent.getStringExtra("specialInfo");

        productTypeTV.setText(productType);
        nameTV.setText(name);
        typeTV.setText(type);
        specialInfoTV.setText(specialInfo);
    }
}
