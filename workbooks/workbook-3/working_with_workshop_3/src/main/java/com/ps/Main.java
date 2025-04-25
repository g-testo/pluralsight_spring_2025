package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        loadProducts();

        int mainMenuCommand;

        do{
            System.out.println("Welcome to the worlds most ammmmaaaaazzzzzing store");
            System.out.println("1) Display products");
            System.out.println("2) Display cart");
            System.out.println("0) Exit");
            System.out.print("What would you like to do? ");
            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    displayProducts();
                    break;
                case 2:
                    displayCart();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Command not found! Try again");
            }

        } while(mainMenuCommand != 0);
    }

    private static void loadProducts() {
    }

    private static void displayProducts() {
        System.out.println("---Display Products---");
        System.out.println("1) Search/Filter");
        System.out.println("2) Add product");
        System.out.println("0) Back");
        System.out.print("What would you like to do? ");

        int displayProductsCommand = scanner.nextInt();

        switch (displayProductsCommand){
            case 1:
                searchFilterProducts();
                break;
            case 2:
                addProduct();
                break;
            case 0:
                System.out.println("Going back");
                break;
            default:
                System.out.println("Incorrect command, going back");
        }

    }

    private static void searchFilterProducts() {
    }

    private static void addProduct() {
    }

    private static void displayCart() {
        System.out.println("---Display Cart---");
        System.out.println("1) Checkout");
        System.out.println("2) Remove product");
        System.out.println("0) Back");
        System.out.print("What would you like to do? ");

        int displayCartCommand = scanner.nextInt();

        switch(displayCartCommand){
            case 1:
                handleCheckout();
                break;
            case 2:
                removeProduct();
            case 0:
                System.out.println("Going back");
            default:
                System.out.println("Incorrect command, going back");
        }
    }

    private static void handleCheckout() {
    }

    private static void removeProduct() {
    }
}