package com.example.dimsa.shop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProductInfoActivity extends AppCompatActivity {

    TextView productTypeTV, nameTV, typeTV, specialInfoTV, pagesTV, priceTV, barcodeTV;
    String productType, name, type, specialInfo, pages;
    int price, barcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        productTypeTV = (TextView) findViewById(R.id.productTV);
        nameTV = (TextView) findViewById(R.id.nameTV);
        typeTV = (TextView) findViewById(R.id.typeTV);
        specialInfoTV = (TextView) findViewById(R.id.specialInfoTV);
        pagesTV = (TextView) findViewById(R.id.pagesTV);
        priceTV = (TextView) findViewById(R.id.priceTV);
        barcodeTV = (TextView) findViewById(R.id.barcodeTV);

        Intent intent = getIntent();
        productType = intent.getStringExtra("productType");
        name = intent.getStringExtra("name");
        type = intent.getStringExtra("type");
        specialInfo = intent.getStringExtra("specialInfo");
        pages = intent.getStringExtra("pages");
        price = intent.getIntExtra("price", 0);
        barcode = intent.getIntExtra("barcode", 0);

        productTypeTV.setText(productType);
        nameTV.setText(name);
        typeTV.setText(type);
        specialInfoTV.setText(specialInfo);
        pagesTV.setText(pages);
        priceTV.setText(String.valueOf(price));
        barcodeTV.setText(String.valueOf(barcode));
    }
}
