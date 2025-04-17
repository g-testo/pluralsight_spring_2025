package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        StringBuilder myAnimals = new StringBuilder();
//        myAnimals.append("Lion, ");
//        myAnimals.append("Goat, ");
//        myAnimals.insert(0, "Monkey, ");
//        myAnimals.append("KittyCat.");
//
//        String myAnimalsString = myAnimals.toString();
//
//        System.out.println(myAnimalsString);

//        BAD!
//        String animals = "";
//        animals+="Lion";
//        animals+="Goat";
//        animals+="Monkey";
//        animals+="KittyCat";

//        String result1 = disemvowel("This website is not fun LOL!"); // Ths wbst s fr lsrs LL!
//        String result2 = disemvowel("No offense but,\nYour writing is not good"); // N ffns bt,\nYr wrtng s mng th wrst 'v vr rd
//
//
//        System.out.println(result1);
//        System.out.println(result2);
        stringBuilderHomework();
    }

    public static void stringBuilderHomework(){
        StringBuilder customerDetails = new StringBuilder();

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

//        System.out.print("Shipping Street: ");
//        System.out.print("Shipping City:" );
//        System.out.print("Shipping State:");
//        System.out.print("Shipping Zip:" );

        customerDetails.append(fullName).append("\n");

        customerDetails.append("Billing Address:\n");

        customerDetails.append(billingStreet).append("\n");
        customerDetails.append(billingCity);
        customerDetails.append(", ");
        customerDetails.append(billingState);
        customerDetails.append(" ");
        customerDetails.append(billingZip).append("\n");

        String customDetailsStr = customerDetails.toString();
        System.out.println(customDetailsStr);

//        Grover Smith
//        Billing Address:
//        123 Main Street
//        Middleton, TX 75111
//        Shipping Address:
//        456 Big Sky Blvd
//        Outer Rim, TX 75333
    }


    public static String disemvowel(String str) {
        StringBuilder comment = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char letter = str.charAt(i);
            char lowerLetter = Character.toLowerCase(letter);
            switch(lowerLetter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    comment.append(letter);
            }
        }
        return comment.toString();
    }

}