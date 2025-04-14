package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Pick a calculator");
        // total_interest: 36,115.99
        // 495.09 * (15*12) - 53,000 = 36,115.99


        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Future value Calculator");
        System.out.println("3) Present value Calculator");
        System.out.println("0) Exit");
        System.out.print("Please select a calculator: ");
        int command = scanner.nextInt();

        switch(command){
            case 1:
                System.out.print("Please provide a principal: ");
                int principal = scanner.nextInt();

                System.out.print("Please provide a annual interest rate: ");
                double annualInterestRate = scanner.nextDouble();

                System.out.print("Please provide a loan term in years: ");
                int loanTermYears = scanner.nextInt();

                calcMonthlyPayment(principal, annualInterestRate, loanTermYears);

                break;
            case 2:
                System.out.println("Running future value Calculator");
                break;
            case 3:
                System.out.println("Running present value Calculator");
                break;
            case 0:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Command not found");
        }



    }

    public static void calcMonthlyPayment(int principal, double annualInterest, int loanTermYears){
        // P - 53,000
        // r = .07625
        // y = 15

        // i = .07625/12
        // i = .00635417
        double monthlyInterest = annualInterest/12;

        // n = 15*12
        // n = 180
        int loanTermMonths = loanTermYears*12;

        double interestRateCalculation = Math.pow(1+monthlyInterest, loanTermMonths);

        double monthPayment = principal * (monthlyInterest * interestRateCalculation) / (interestRateCalculation - 1);
//      53,000 * (.00635417 * (1+.00635417)^(15*12) / ((1+.00635417)^(15*12)-1) = 495.09
//      53,000 * (.00635417 * (1.00635417)^(180) / ((1.00635417)^(180)-1) = 495.09
//      53,000 * (.00635417 * 3.12718152 / (2.12718152) = 495.09
//      53,000 * (.00635417 * 3.12718152 / (2.12718152) = 495.09
//      53,000 * 0.0093413

        System.out.println(monthPayment);
        // payment: 495.09
    }
}