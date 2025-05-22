package com.ps.core;

import java.util.Arrays;
import java.util.List;

public class Hotel extends AddOn{
    private static List<Integer> prices = Arrays.asList(150,200,250);
    private int chosenPriceTier;

    public Hotel(int chosenPriceTier) {
        this.chosenPriceTier = chosenPriceTier;
    }

    public int getChosenPriceTier() {
        return chosenPriceTier;
    }

    public void setChosenPriceTier(int chosenPriceTier) {
        this.chosenPriceTier = chosenPriceTier;
    }

    public static List<Integer> getPrices() {
        return prices;
    }

    @Override
    public double calcPrice() {
        int index = chosenPriceTier - 1;
        return prices.get(index);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                ", price=" + calcPrice() +
                '}';
    }
}
