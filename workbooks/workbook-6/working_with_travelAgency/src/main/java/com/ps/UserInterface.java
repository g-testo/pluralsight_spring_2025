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

    public static void init() {
        travelAgency = new TravelAgency("Allons-y", "123 Let's go blvd, Manhattan, NYC", "212-212-1122");
        display();
    }

    public static void display() {
        int mainMenuCommand;

        do {
            System.out.println("--------Welcome to Allons-y Travel Agency!--------");
            System.out.println("1) Create trip");
            System.out.println("0) Exit");
            System.out.print("Command: ");
            mainMenuCommand = scanner.nextInt();

            switch (mainMenuCommand) {
                case 1:
                    displayTripMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command, try again");
            }

        } while (mainMenuCommand != 0);
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
        List<Destination> chosenDestinations = new ArrayList<>();
        int destinationMenuInput;
        do {
            System.out.println("--------Choose your destinations--------");
            List<Destination> allDestinations = travelAgency.getOfferedDestinations();
            for (int i = 0; i < allDestinations.size(); i++) {
                Destination currentDestination = allDestinations.get(i);
                System.out.printf("%d) %16s \t\t- $%.2f\n", i + 1, currentDestination.getCityName(), currentDestination.calcPrice());
            }
            System.out.println("0) Done");
            System.out.print("Destination Choice: ");
            destinationMenuInput = scanner.nextInt();
            if(destinationMenuInput != 0) {
                Destination chosenDestination = allDestinations.get(destinationMenuInput - 1);
                chosenDestinations.add(chosenDestination);
            }
        } while (destinationMenuInput != 0);

        // Activities
        List<String> chosenActivities = new ArrayList<>();
        int activityMenuInput;
        do {
            System.out.println("--------Choose your activities--------");
            List<String> allActivities = travelAgency.getOfferedActivities();
            for (int i = 0; i < allActivities.size(); i++) {
                String currentActivity = allActivities.get(i);
                System.out.printf("%d) %s", i + 1, currentActivity);
            }
            System.out.println("0) Done");
            System.out.print("Activity Choice: ");
            activityMenuInput = scanner.nextInt();
            if(activityMenuInput != 0) {
                String chosenActivity = allActivities.get(activityMenuInput - 1);
                chosenActivities.add(chosenActivity);
            }
        } while (activityMenuInput != 0);


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
