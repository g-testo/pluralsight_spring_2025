package com.ps;

public class Main {
    public static void main(String[] args) {
        int result = add(1, 3, 5);
        System.out.println(result);


    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}