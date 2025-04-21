package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int mainMenuCommand;
        do{
            // Welcome to the firework management system. What would you like to do?
            System.out.println("Welcome to the firework management system.");

            // 1) View all fireworks
            System.out.println("1) View all fireworks");
            // 2) View banned fireworks
            System.out.println("2) View banned fireworks");
            // 0) Exit
            System.out.println("0) Exit");

            System.out.print("What would you like to do? ");

            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    System.out.println("Displaying all fireworks");
                    break;
                case 2:
                    System.out.println("Displaying all banned fireworks");
                    // TODO
                    // 1) Ban firework by providing an id
                    // 2) Back
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid command! Try again");
            }

        } while(mainMenuCommand != 0);


    }
}