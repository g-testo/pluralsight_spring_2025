package com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        books.add(new Book("Sorcerer", "Jk Rowling"));


        for(Book book: books){
            System.out.println(book);
        }
//        for(int i=0;i<books.size();i++){
//            System.out.println(books.get(i));
//        }
//        int num = 10;

//        Integer superNum = 10;
//        Boolean booly = true;
//        Byte bytey = 5;
//        Character chary = 'G';
//        Short shorty = 100;
//        Long longy = 100000L;
//        Double doubly = 2.373;
//        Float floaty = 12.99F;

//        ArrayList<Integer> nums = new ArrayList<>();

//        1) Create Product class, code, name, price




    }

    public static void simpleExamples(){
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Peacock", "Lemur", "Koala", "Ant Eater")
        );
        words.add("Lion");
        words.add(0, "Bird");
        words.add(0,"Kangaroo");

//        words.remove("Bird");

        System.out.println(words);


        // Favorite animals
        // "greg" >> "Lion"
        // "mahmoud" >> "Monkey"

        HashMap<String, String> favoriteAnimals = new HashMap<>();
        favoriteAnimals.put("mahmoud", "Monkey");
        favoriteAnimals.put("greg", "Lion");

        System.out.println(favoriteAnimals);

        int num1 = 22;
        int num2 = 99;
        int num3 = 500;
        // Firework: name, isBanned
//        [ new Firwork("M80", true) ]
//        ["m80", true]
    }

}