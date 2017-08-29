package com.example.dimsa.shop;


public class ProgrammingBook extends Book{
    static final String TYPE = "Программирование";

    private String language;

    public ProgrammingBook(String name, int price, int barcode, int pages, String language) {
        super(name, price, barcode, pages);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
