package com.ps;

import com.ps.core.AddOn;
import com.ps.core.Destination;
import com.ps.core.TravelAgency;
import com.ps.core.Trip;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static TravelAgency travelAgency;
    private static Scanner scanner = new Scanner(System.in);

    public static void init(){
        // TODO: Create travel agency
        // travelAgency = new TravelAgency("Allons-y");
        display();
    }

    public static void display(){
        // TODO: Add main menu loop

        int mainMenuCommand;

        do{
            System.out.println("--------Welcome to Allons-y Travel Agency!--------");
            System.out.println("1) Create trip");
            System.out.println("0) Exit");
            System.out.print("Command: ");
            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    displayTripMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command, try again");
            }

        } while(mainMenuCommand != 0);
    }

    private static void displayTripMenu() {
        System.out.println("Please enter trip details: ");
        scanner.nextLine();

        // name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // address
        System.out.print("Please enter your address: ");
        String address = scanner.nextLine();

        // phone
        System.out.print("Please enter your phone number: ");
        String phone = scanner.nextLine();

        // how many travellers
        System.out.print("Additional travelers: ");
        int numOfTravelers = scanner.nextInt();

        // store current date as reserved date
        String reservationDate = LocalDateTime.now().toString();

        scanner.nextLine();
        // start date
        System.out.print("Start date: ");
        String startDate = scanner.nextLine();

        // end date
        System.out.print("End date: ");
        String endDate = scanner.nextLine();

        // Destinations
        // TODO: Ask user for destinations
        List<Destination> chosenDestinations = new ArrayList<>();
        int destinationMenuInput;
        do{
            System.out.println("--------Choose your destinations--------");
//            List<Destination> allDestinations = travelAgency.getOfferedDestinations();
            // 1) Mexico City
            // 2) San Jose
            // 3) NYC
//            System.out.println("0) Exit");
            System.out.print("Choice: ");
            destinationMenuInput = scanner.nextInt();
//            chosenDestinations.add();
        } while(destinationMenuInput != 0);

        // Activities
        List<String> chosenActivities = new ArrayList<>();
        // TODO: Ask user for activities

        // AddOns
        List<AddOn> chosenAddOns = new ArrayList<>();
        // TODO: Ask user for add ons
            // Hotel
                // Insurance
                // Transportation


        handleCheckout();

        // TODO add details to trip
        Trip trip = new Trip();

        // Checkout
    }

    private static void handleCheckout() {
        // Print trip details

        // Write receipt to a file
    }
}
