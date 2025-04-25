package com.ps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> inventory = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();

    public static void main(String[] args) {
        loadProducts();

        int mainMenuCommand;

        do {
            System.out.println("Welcome to the worlds most ammmmaaaaazzzzzing store");
            System.out.println("1) Display products");
            System.out.println("2) Display cart");
            System.out.println("0) Exit");
            System.out.print("What would you like to do? ");
            mainMenuCommand = scanner.nextInt();

            switch (mainMenuCommand) {
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

        } while (mainMenuCommand != 0);
    }

    private static void loadProducts() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("products.csv"));

            String input;

            while((input = bufferedReader.readLine()) != null){
                String[] fields = input.split("\\|");

                String sku = fields[0];
                String productName = fields[1];
                float price = Float.parseFloat(fields[2]);
                String department = fields[3];

                Product product = new Product(sku, productName, price, department);

                inventory.add(product);
            }

            bufferedReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void displayProducts() {
        System.out.println("---Display Products---");
        System.out.println("1) Search/Filter");
        System.out.println("2) Add product");
        System.out.println("0) Back");
        System.out.print("What would you like to do? ");

        int displayProductsCommand = scanner.nextInt();

        switch (displayProductsCommand) {
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

        System.out.println("---Search or Filter Products---");
        System.out.println("1) Display all");
        System.out.println("2) Find product by name");
        System.out.println("3) Filter products by department");
        System.out.println("0) Back");
        System.out.print("What would you like to do? ");
        int searchFilterProductsCommand = scanner.nextInt();

        switch (searchFilterProductsCommand){
            case 1:
                displayAllProducts();
                break;
            case 2:
                findProductByName();
                break;
            case 3:
                filterByDepartment();
                break;
            case 0:
                System.out.println("Going back...");
                break;
            default:
                System.out.println("Invalid input, going back");
        }
    }

    private static void displayAllProducts() {
        for(Product product: inventory){
            System.out.println(product);
        }
    }

    private static void findProductByName() {
        System.out.print("Please provide a product name: ");
        scanner.nextLine();
        String productNameInput = scanner.nextLine();

        for(Product product: inventory){
            String currentProductName = product.getProductName();
            if(currentProductName.equalsIgnoreCase(productNameInput)){
                System.out.println(product);
                break;
            }
        }
        System.out.println("Product not found");
    }

    private static void filterByDepartment() {
        System.out.println("Please provide a department: ");
        scanner.nextLine();
        String departmentInput = scanner.nextLine();

        for(Product product: inventory){
            String currentDepartment = product.getDepartment();
            if(currentDepartment.equalsIgnoreCase(departmentInput)){
                System.out.println(product);
            }
        }
    }

    private static void addProduct() {
        System.out.print("Please provide a product name: ");
        String productNameInput = scanner.nextLine();

        for(Product product: inventory){
            String currentProductName = product.getProductName();
            if(currentProductName.equalsIgnoreCase(productNameInput)){
                cart.add(product);
                System.out.println("Product successfully added");
                break;
            }
        }
        System.out.println("Product not found");
    }

    private static void displayCart() {
        System.out.println("---Display Cart---");
        System.out.println("1) Checkout");
        System.out.println("2) Remove product");
        System.out.println("0) Back");
        System.out.print("What would you like to do? ");

        int displayCartCommand = scanner.nextInt();

        switch (displayCartCommand) {
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
        for(Product product: cart){
            System.out.println(product);
        }
    }

    private static void removeProduct() {
        System.out.print("Please provide a product name: ");
        String productNameInput = scanner.nextLine();

        for(Product product: inventory){
            String currentProductName = product.getProductName();
            if(currentProductName.equalsIgnoreCase(productNameInput)){
                cart.remove(product);
                break;
            }
        }
        System.out.println("Product not found");
    }
}