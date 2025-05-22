package com.ps;

import com.ps.core.*;

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
        String customerName = scanner.nextLine();

        // address
        System.out.print("Please enter your address: ");
        String customerAddress = scanner.nextLine();

        // phone
        System.out.print("Please enter your phone number: ");
        String customPhone = scanner.nextLine();

        // how many travelers
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
            if (destinationMenuInput != 0) {
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
                System.out.printf("%d) %s\n", i + 1, currentActivity);
            }
            System.out.println("0) Done");
            System.out.print("Activity Choice: ");
            activityMenuInput = scanner.nextInt();
            if (activityMenuInput != 0) {
                String chosenActivity = allActivities.get(activityMenuInput - 1);
                chosenActivities.add(chosenActivity);
            }
        } while (activityMenuInput != 0);


        // AddOns
        List<AddOn> chosenAddOns = new ArrayList<>();
        int addOnMenuInput;
        do {
            System.out.println("--------Choose your add ons--------");

            System.out.println("1) Add Premium Hotel");
            System.out.println("2) Add Transportation");
            System.out.println("3) Add Insurance");
            System.out.println("0) Done");

            System.out.print("Add On Choice: ");
            addOnMenuInput = scanner.nextInt();

            switch (addOnMenuInput) {
                case 1:
                    System.out.println("You don't want the haunted one, do you? \nChoose a better hotel: ");

                    List<Integer> prices = Hotel.getPrices();
                    for (int i = 0; i < prices.size(); i++) {
                        System.out.printf("%d) $%d\n", i + 1, prices.get(i));
                    }
                    System.out.print("Add on choice: ");
                    int hotelPriceChoice = scanner.nextInt();

                    chosenAddOns.add(new Hotel(hotelPriceChoice));
                    break;
                case 2:
                    chosenAddOns.add(new Transportation());
                    break;
                case 3:
                    chosenAddOns.add(new Insurance());
                    break;
                default:
                    System.out.println("Incorrect command, try again");
            }

        } while (destinationMenuInput != 0);

        Trip trip = new Trip(customerName, customPhone, customerAddress, reservationDate, startDate, endDate, numOfTravelers, chosenDestinations, chosenActivities, chosenAddOns);
        handleCheckout(trip);
    }

    private static void handleCheckout(Trip trip) {
        System.out.println("Checking out");
        travelAgency.addReservation(trip);
        // Write receipt to a file
        FileManager.writeReceipt(travelAgency, trip);
        System.out.println("Receipt successfully printed");
    }
}
