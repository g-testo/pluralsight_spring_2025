package com.ps;

public class Lion extends Animal{
    private float lengthOfMane;

    public Lion(){
        super(4);
    }

    public Lion(int numOfLegs) {
        super(numOfLegs);
    }

    public float getLengthOfMane() {
        return lengthOfMane;
    }

    public void setLengthOfMane(float lengthOfMane) {
        this.lengthOfMane = lengthOfMane;
    }

    @Override
    public void makeAnimalNoise(){
        System.out.println("RRROOOOOOAAAaaarrrrrr");
    }

}
