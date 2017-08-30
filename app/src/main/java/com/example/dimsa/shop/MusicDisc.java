package com.example.dimsa.shop;

public class MusicDisc extends Disc {
    static final String CONTENTTYPE = "Музыка";

    public MusicDisc(String name, int price, int barcode, Disc.DiscType discType) {
        super(name, price, barcode, discType);
    }
}

