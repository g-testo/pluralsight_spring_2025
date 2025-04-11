package com.ps;

public class Main {
    public static void main(String[] args) {
        float price = 99.9919F;
        System.out.printf("The price of the item is: $%.2f, and it's totally expressive\n", price);
        System.out.printf("The price of the item is: $" + Math.round(price) + ", and it's totally expressive\n");

        String name = "Syed";
        System.out.printf("Horrray, it is %s's birthday!\n", name);

    }
}
