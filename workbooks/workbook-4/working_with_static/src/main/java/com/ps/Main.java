package com.ps;

public class Main {
    public static void main(String[] args) {
        MyCounter myCounter1 = new MyCounter(); // 0
        MyCounter myCounter2 = new MyCounter();
        MyCounter myCounter3 = new MyCounter();

        myCounter1.incrementInstance(); // 1
        myCounter1.incrementInstance(); // 2

        myCounter2.incrementInstance(); // 1
        myCounter2.incrementInstance(); // 2
        myCounter2.incrementInstance(); // 3
        myCounter2.incrementInstance(); // 4



        int currentCountMyCounter1 = myCounter1.getCounterInstance();
//        System.out.println(currentCountMyCounter1);

        int currentCountMyCounter2 = myCounter2.getCounterInstance();
        System.out.println(currentCountMyCounter2);

        int currentCountMyCounter3 = myCounter3.getCounterInstance();


    }
}
