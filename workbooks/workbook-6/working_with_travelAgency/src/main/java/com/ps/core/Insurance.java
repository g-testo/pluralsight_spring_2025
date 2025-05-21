package com.ps.core;

public class Insurance extends AddOn{
    private int price = 100;

    public Insurance() {}

    @Override
    public double calcPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "price=" + price +
                '}';
    }
}
