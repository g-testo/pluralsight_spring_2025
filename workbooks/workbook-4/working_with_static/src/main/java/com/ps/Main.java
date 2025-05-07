package com.ps;

public class Main {
    public static void main(String[] args) {
        MyCounter myCounter1 = new MyCounter(); // instance: 0, static: 0
        MyCounter myCounter2 = new MyCounter(); // instance: 0, static: 0
        MyCounter myCounter3 = new MyCounter(); // instance: 0, static: 0

        myCounter1.incrementInstance(); // instance: 1, static: 0
        myCounter1.incrementInstance(); // instance: 2, static: 0

        myCounter1.incrementStatic(); // instance: 2, static: 1
        myCounter1.incrementStatic(); // instance: 2, static: 2
        myCounter1.incrementStatic(); // instance: 2, static: 3

        myCounter2.incrementStatic(); // instance: 0, static: 4

        myCounter3.incrementStatic(); // instance: 0, static: 5

        myCounter2.incrementInstance(); // instance: 1, static: 5
        myCounter2.incrementInstance(); // instance: 2, static: 5
        myCounter2.incrementInstance(); // instance: 3, static: 5
        myCounter2.incrementInstance(); // instance: 4, static: 5

        MyCounter.incrementStatic();  // static: 6


        // Static!

        int staticCurrentCount1 = myCounter1.getCounterStatic();
//        System.out.println(staticCurrentCount1);

        int staticCurrentCount2 = myCounter2.getCounterStatic();
        System.out.println(staticCurrentCount2);



        // Instance!
//        int currentCountMyCounter1 = myCounter1.getCounterInstance();
////        System.out.println(currentCountMyCounter1);
//
//        int currentCountMyCounter2 = myCounter2.getCounterInstance();
////        System.out.println(currentCountMyCounter2);
//
//        int currentCountMyCounter3 = myCounter3.getCounterInstance();
//        System.out.println(currentCountMyCounter3);


    }
}
