package com.ps;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Please select an operation: ");
        int givenCommand = scanner.nextInt();

        System.out.print("First whole number: ");
        float firstNum = scanner.nextFloat();

        System.out.print("Second whole number: ");
        float secondNum = scanner.nextFloat();



    }
}
