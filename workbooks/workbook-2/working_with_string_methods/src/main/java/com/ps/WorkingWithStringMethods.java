package com.ps;

import java.util.regex.Pattern;

public class WorkingWithStringMethods {
    public static void main(String[] args){
//        String words = "Hello World";
//        System.out.println(words.indexOf("r"));
//
//
//        String productCode = "PLURALSIGHT,12213,hammer";
//        int commaPosition = productCode.indexOf(",");
//        String companyCode = productCode.substring(0, commaPosition);
//        System.out.println(companyCode);

        String animalPref1 = "George|Monkey|Bananas";
        String animalPref2 = "Clifford|Dog|Dog Food";

        String[] animal1 = animalPref1.split("\\|"); // "/|"

        System.out.println(animal1[0] + " " + animal1[1]); // ["George", "Monkey", "Bananas"]

        String[] animal2 = animalPref2.split(Pattern.quote("|")); // "/|"
        System.out.println(animal2[0]);

    }
}
