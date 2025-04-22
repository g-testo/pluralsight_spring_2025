package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] quotes = {
                    "Measure twice, cut once", "Early bird gets the worm"
            };

            System.out.print("Pick a quote (select #1 - #2): ");
            int userOption = scanner.nextInt();
            userOption--;
            System.out.println(quotes[userOption]);
        } catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }

        scanner.close();


        System.out.println("This runs after the quotes");
    }
}