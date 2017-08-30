package com.example.dimsa.shop;

public class EsotericsBook extends Book {
    static final String CONTENTTYPE = "Эзотерика";

    private int minAge;

    public EsotericsBook(String name, int price, int barcode, int pages, int minAge) {
        super(name, price, barcode, pages);
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
}
