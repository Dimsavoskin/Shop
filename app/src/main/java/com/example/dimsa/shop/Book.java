package com.example.dimsa.shop;


public class Book extends Product {
    private int pages;
    private enum Type {prog,cook,esoteric}

    public Book(String name, int price, int barcode, int pages) {
        super(name, price, barcode);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
