package com.ps.core;

import java.util.Arrays;
import java.util.List;

public class Destination {
    private String cityName;
    private int chosenPriceTier;

    private final List<Integer> dailyPrices = Arrays.asList(200,300,500);

    public Destination() {}

    public Destination(String cityName, int chosenPriceTier) {
        this.cityName = cityName;
        this.chosenPriceTier = chosenPriceTier;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getChosenPriceTier() {
        return chosenPriceTier;
    }

    public void setChosenPriceTier(int chosenPriceTier) {
        this.chosenPriceTier = chosenPriceTier;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "cityName='" + cityName + '\'' +
                ", chosenPriceTier=" + chosenPriceTier +
                '}';
    }
}
