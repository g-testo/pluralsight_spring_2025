package com.ps;

public class Main {
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

        String result1 = disemvowel("This website is not fun LOL!"); // Ths wbst s fr lsrs LL!
        String result2 = disemvowel("No offense but,\nYour writing is not good"); // N ffns bt,\nYr wrtng s mng th wrst 'v vr rd


        System.out.println(result1);
        System.out.println(result2);

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