package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            String[] animals = {
                    "Kangaroo",
                    "Lion",
                    "Monkey",
                    "Lemur",
                    "Raccoon",
                    "Fox",
                    "Falcon"
            };
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("animals.txt"));
            for(int i=0;i<animals.length;i++){ // 1|Kangaroo
                String formatedAnimal = String.format("%d|%s\n", i+1, animals[i]);
                bufferedWriter.write(formatedAnimal);
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}