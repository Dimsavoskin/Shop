package com.example.dimsa.shop;

public class CookeryBook extends Book {
    static final String CONTENTTYPE = "Кулинария";

    private String ingredient;

    public CookeryBook(String name, int price, int barcode, int pages, String ingredient) {
        super(name, price, barcode, pages);
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
