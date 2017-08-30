package com.example.dimsa.shop;

public class ProgrammingDisc extends Disc{
    static final String CONTENTTYPE = "Программное обеспечение";

    public ProgrammingDisc(String name, int price, int barcode, DiscType discType) {
        super(name, price, barcode, discType);
    }
}
