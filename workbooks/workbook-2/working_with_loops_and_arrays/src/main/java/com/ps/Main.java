package com.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static String[] inventory = new String[20];

    String[] words = {
            "dfsfsd",
            "sdfsf",
            "sdjofj"
    };



    public static void main(String[] args) {
        // [ "string1", "string2", "string3" ]
        String[] easterStuff = {
                "Bunny Ears",
                "Cadbury Eggs",
                "Carrot Cate",
                "Easter egg hunt"
        };

        for(String item: easterStuff){
            System.out.println("I'm looking forward to " + item);
        }

//        for(int i=0; i < easterStuff.length; i++){
//            System.out.println("I'm looking forward to " + easterStuff[i]);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i % 3 == 0) {
//                break;
//            }
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);
//        for(int i=5;i>=0;i-=2){
//            System.out.println(i);
//        }

//        int num = 1;
//        do {
//
//            if(num > 1_000){
//                break;
//            }
//            System.out.print("Please enter a number: ");
//            int numInput = scanner.nextInt();
//            num += numInput;
//
//            if(num == 100){
//                continue;
//            }
//
//            System.out.println(num);
//        } while(num%2 == 0);
    }

    public static void addItem(String item){
        for(int i=0; i< inventory.length; i++){
            if(inventory[i].equals(null)){
                inventory[i] = item;
            }
        }
    }
}