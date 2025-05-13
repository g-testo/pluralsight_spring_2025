package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>(
                Arrays.asList(
                    new House(2, 1000, 1000),
                    new House(1, 2000, 5000),
                    new Vehicle(20_000,"Honda Accord", 2020, 30_000),
                    new Vehicle(400_000,"Lamborghini Aventador", 2023, 60_000)
                )
        );

        double totalValue = 0;

        for(Asset asset: assets){
            totalValue += asset.getValue();
        }

        System.out.println(totalValue);

    }
}
