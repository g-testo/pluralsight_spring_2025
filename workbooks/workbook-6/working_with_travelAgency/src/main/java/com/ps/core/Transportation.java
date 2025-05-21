package com.ps.core;

public class Transportation extends AddOn{
    private int price = 50;

    public Transportation() {}

    @Override
    public double calcPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "price=" + price +
                '}';
    }
}
