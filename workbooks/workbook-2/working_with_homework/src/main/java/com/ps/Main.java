package com.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        homeworkOne();
        homeworkTwo();


    }

    public static void homeworkTwo(){
        String teamScoresStr = "Home:Visitor|21:9";
        String[] teamScoresArr = teamScoresStr.split("\\|"); // [ "Home:Visitor", "21:9" ]

        String teamNames = teamScoresArr[0]; // "Home:Visitor"
        String scores = teamScoresArr[1]; // "21:9"

        String[] teamNamesArr = teamNames.split(":");// [ "Home", "Visitor" ]
        String[] scoresArr = scores.split(":"); // [ "21", "9" ] // Compare numbers

        int teamOneScore = Integer.parseInt(scoresArr[0]); // 21
        int teamTwoScore = Integer.parseInt(scoresArr[1]); // 9

        if(teamOneScore > teamTwoScore){
            System.out.println("Winner: " + teamNamesArr[0]); // "Winner: Home"
        } else if(teamTwoScore > teamOneScore){
            System.out.println("Winner: " + teamNamesArr[1]); // "Winner: Visitor"
        } else {
            System.out.println("Tie");
        }
    }

    public static void homeworkOne(){
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if(!middleName.isEmpty()){
            char firstChar = Character.toUpperCase(middleName.charAt(0));
//            String firstLetter = Character.toString(middleName.charAt(0));
//            char firstUpperCaseLetter = firstLetter.toUpperCase();
            fullName += " " + firstChar + ".";
        }

        fullName += " " + lastName;

        if(!suffix.isEmpty()){
            fullName += ", " + suffix;
        }

        System.out.printf("Full name: %s", fullName);

    }

}