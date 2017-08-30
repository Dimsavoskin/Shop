package com.example.dimsa.shop;

public class Disc extends Product {
    enum DiscType {CD, DVD}

    private DiscType discType;

    public Disc(String name, int price, int barcode, DiscType discType) {
        super(name, price, barcode);
        this.discType = discType;
    }

    public DiscType getDiscType() {
        return discType;
    }

    public void setDiscType(DiscType discType) {
        this.discType = discType;
    }
}
