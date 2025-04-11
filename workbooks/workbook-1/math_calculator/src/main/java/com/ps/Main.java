package com.ps;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Please select an operation: ");
        int givenCommand = scanner.nextInt();

        System.out.print("First whole number: ");
        float firstNum = scanner.nextFloat();

        System.out.print("Second whole number: ");
        float secondNum = scanner.nextFloat();

        float result = 0;

        switch(givenCommand){
            case 1:
                result = firstNum + secondNum;
                break;
            case 2:
                result = firstNum - secondNum;
                break;
            case 3:
                result = firstNum * secondNum;
                break;
            case 4:
                if(secondNum == 0){
                    System.out.println("You can't divide by zero");
                } else {
                    result = firstNum / secondNum;
                }
                break;
            default:
                System.out.println("Invalid command, try again");
        }

//        if(givenCommand == 1){
//            result = firstNum + secondNum;
//        } else if(givenCommand == 2) {
//            result = firstNum - secondNum;
//        } else if(givenCommand == 3){
//            result = firstNum * secondNum;
//        } else if(givenCommand == 4){
//            if(secondNum == 0){
//                System.out.println("You can't divide by zero");
//            } else {
//                result = firstNum / secondNum;
//            }
//        } else {
//            System.out.println("Invalid command, try again");
//        }

        System.out.printf("Result: %.3f", result);

    }
}
