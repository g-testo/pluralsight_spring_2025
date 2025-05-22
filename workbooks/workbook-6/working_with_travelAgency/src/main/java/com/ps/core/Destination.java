package com.ps.core;

import java.util.Arrays;
import java.util.List;

public class Destination implements Product{
    private String cityName;
    private int designatedPriceTier;

    private final List<Integer> prices = Arrays.asList(200,300,500);

    public Destination() {}

    public Destination(String cityName, int designatedPriceTier) {
        this.cityName = cityName;
        this.designatedPriceTier = designatedPriceTier;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getDesignatedPriceTier() {
        return designatedPriceTier;
    }

    public void setDesignatedPriceTier(int designatedPriceTier) {
        this.designatedPriceTier = designatedPriceTier;
    }

    public double calcPrice(){
        int index = this.designatedPriceTier - 1;
        return prices.get(index);
    }

    @Override
    public String toString() {
        return "Destination{" +
                "cityName='" + cityName + '\'' +
        '}';
    }
}
