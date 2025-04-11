package com.ps;

public class Main {
    public static void main(String[] args) {
        String word = "Bananas";
        String endOfPhrase = " are absolutely disgusting";

        String completePhrase = word + endOfPhrase;

        System.out.println(completePhrase);

        /// ///

        int num = 5;
//
        num = num + 1;
        num+=1;
        num++;
//
//        System.out.println(++num);
//        System.out.println(num);



//        boolean booly = true;
//        double price = 10.2f;
//        float floaty = 1000f;
//        short shorty = 10_000;
//        long longy = 10_000_000;

        int myInt;
        long myLong = 9;
        float myFloat;
        double myDouble = 123.4567890123;

        // an int won't necessarily fit in a long
        myInt = myLong;

        // a double won't necessarily fit in a float
        myFloat = myDouble;

        // a float probably won't necessarily fit in an int
        myLong = myFloat;

    }
}
