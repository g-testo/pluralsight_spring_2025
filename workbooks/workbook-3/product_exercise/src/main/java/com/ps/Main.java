package com.ps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        loadInventory();

        for(Product product: inventory){
            System.out.println(product);
        }

    }

    public static void loadInventory(){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String input;
            while((input = bufferedReader.readLine()) != null){
                String[] fields = input.split("\\|");
                int id = Integer.parseInt(fields[0]); // "4567"
                String name = fields[1];
                float price = Float.parseFloat(fields[2]);

                Product product = new Product(id, name, price);
                inventory.add(product);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}