package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String word = "Kangaroo";

//        if(word instanceof String){
//
//        }

//        System.out.println(word.getClass());

        ArrayList<Animal> animals = new ArrayList<>(
                Arrays.asList(
                        new Animal(),
                        new Animal(),
                        new Animal(),
                        new Lion(),
                        new Lion()
                )
        );

        for(Animal animal: animals){
//            if(animal instanceof Lion){
//                animal.makeAnimalNoise();
//            }
            System.out.println(animal.getClass());
        }

//        Animal leo;
//
//        leo = new Lion();
//
//        leo.setNumOfLegs(4);
    }
}
