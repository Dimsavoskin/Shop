package com.example.dimsa.shop;


public class CookeryBook extends Book {
    String ingredient;

    public CookeryBook(String name, int price, int barcode, int pages, String ingredient) {
        super(name, price, barcode, pages);
        this.ingredient = ingredient;
    }
}
