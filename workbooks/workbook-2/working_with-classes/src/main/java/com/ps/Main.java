package com.ps;

public class Main {
    public static void main(String[] args) {
//       String myPhrase = Phrases.phrase1;
//        Phrases.printPhrase(myPhrase);

        // Constructor Method
        // Capitalized
        // The name of the method is the same name as the class
        // Is no return type
        Student student1 = new Student(593785, "Syed", 4.0F);
        Student student2 = new Student(2432434, "Sheik", 3.9F);

        Student student3 = new Student();


        System.out.println(student2.getCurrentGrade());



    }
}