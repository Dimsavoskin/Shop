package com.example.dimsa.shop;

public class VideoDisc extends Disc{
    static final String CONTENTTYPE = "Видео";

    public VideoDisc(String name, int price, int barcode, DiscType discType) {
        super(name, price, barcode, discType);
    }
}
