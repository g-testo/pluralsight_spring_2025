package com.ps;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Boolean> students = new ArrayList<>();
//
//        HashMap<String, Boolean> studentsGrades = new HashMap<>();
//        studentsGrades.put("Ozzie", true);


        Pair<Integer> integerPair = new Pair<>(10, 50);


        integerPair.getLeftNumber();
        Main.add();

//        List<String> titles = Arrays.asList(
//                "Halloween"
//                ,
//                "Ghost"
//                ,
//                "Halloween 2"
//                ,
//                "Friday the 13th"
//                ,
//                "Twister"
//                ,
//                "Halloween 3");
//        List<String> matching = titles.stream()
//                .filter(title -> title.toLowerCase().contains("halloween"))
//                .collect(Collectors.toCollection(Vector::new));




        List<String> titles = Arrays.asList(
                "Halloween"
                ,
                "Ghost"
                ,
                "Halloween 2"
                ,
                "Friday the 13th"
                ,
                "Twister"
                ,
                "Halloween 3");
//        titles.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
//                .forEach(System.out::println);
//              .forEach(title-> System.out.println(title));

        titles.stream().forEach(person-> {
            System.out.println("Person...");
            System.out.println(person.getName());
        });


    }

    public static void add() {

    }
}
