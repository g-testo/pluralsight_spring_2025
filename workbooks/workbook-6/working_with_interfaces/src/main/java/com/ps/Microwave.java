package com.ps;

public class Microwave implements Cleanable{
    @Override
    public void clean(){
        System.out.println("Scrub, scrub, scrub");
    }
}
