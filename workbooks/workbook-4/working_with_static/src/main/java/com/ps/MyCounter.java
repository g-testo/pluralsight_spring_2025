package com.ps;

public class MyCounter {
    private static int counterStatic;
    private int counterInstance;

    public static void incrementStatic(){
        counterStatic++;
    }

    public void incrementInstance(){
        counterInstance++;
    }

    public static int getCounterStatic(){
        return counterStatic;
    }

    public int getCounterInstance(){
        return counterInstance;
    }
}
