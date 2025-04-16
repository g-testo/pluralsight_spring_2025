package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if(!middleName.isEmpty()){
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if(!suffix.isEmpty()){
            fullName += ", " + suffix;
        }

        System.out.printf("Full name: %s", fullName);
    }
}