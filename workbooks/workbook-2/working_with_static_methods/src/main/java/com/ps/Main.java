package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        float sumResult1 = add(10, 5); //Arguments
//        float sumResult2 = add(3, 9);
//        float sumResult3 = add(8, 4);
//        System.out.println(sumResult1 + sumResult2 + sumResult3);
//
//        float subResult1 = sub(10, 5);
//        System.out.println(subResult1);

//        scannerAdd();
//        scannerSub();
//
//        String word = "word";

        // matching return type, name of the variable, assigning, method name to call, passing arguments
        String fullName = nancysMethod("Nancy", "Bishwakarma");

        System.out.println(fullName);

    }

    // Access specifier, static modifier, return type, name of method, parameters
    public static String nancysMethod(String firstName, String lastName) {
        return "Welcome " + firstName + " " + lastName + "!";
    }

//    public static void scannerAdd(){
//        System.out.print("Number 1: ");
//        float num1 = scanner.nextFloat();
//
//        System.out.print("Number 2: ");
//        float num2 = scanner.nextFloat();
//
//        System.out.println(num1 + num2);
//    }
//    public static void scannerSub(){
//        System.out.print("Number 1: ");
//        float num1 = scanner.nextFloat();
//
//        System.out.print("Number 2: ");
//        float num2 = scanner.nextFloat();
//
//        System.out.println(num1 - num2);
//    }

//    public static float add(float num1, float num2 /* Parameters */ ){
//        return num1 + num2;
//    }
//    public static float sub(float num1, float num2){
//        return num1 - num2;
//    }



    //        System.out.printf("Greg says 'We are adding...\nThe result is %.2f.'\n", num1 + num2);
}