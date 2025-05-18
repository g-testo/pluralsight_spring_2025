package com.ps;

public abstract class Animal {
    private String species;


    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    abstract public void eat();

    abstract public void sleep();

}
