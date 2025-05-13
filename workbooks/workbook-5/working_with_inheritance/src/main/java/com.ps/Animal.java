package com.ps;

public class Animal {
    private int numOfLegs;

    public Animal(){}

    public Animal(int numOfLegs){
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void makeAnimalNoise(){
        System.out.println("AAAHhhhhhhhhhh");
    }
}
