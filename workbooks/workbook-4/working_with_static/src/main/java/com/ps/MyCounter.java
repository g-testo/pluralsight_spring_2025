package com.ps;

public class MyCounter {
    private static int counterStatic = 0;
    private int counterInstance = 0;

    public static void incrementStatic(){
        counterStatic++;
    }

    public void incrementInstance(){
        this.counterInstance++;
    }

    public static int getCounterStatic(){
        return counterStatic;
    }

    public int getCounterInstance(){
        return this.counterInstance;
    }
}
