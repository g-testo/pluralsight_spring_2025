package com.ps;
import java.util.Arrays;
import java.util.Scanner;

// Create an array to store inventory

// Create a sub menu for (un)banning fireworks
// Add some loops for displaying
// Add the ability to set(unset) ban

public class ComplexMenu {
    static Scanner scanner = new Scanner(System.in);
    static Firework[] fireworks = new Firework[100];

    public static void main(String[] args) {
        loadFireworks();

        // Steps to make a looping menu
        // 1) Create variable to store command
        int mainMenuCommand;

        // 2) create do while loop
        do{

            // 3) Display menu and prompt user for input
            // Welcome to the firework management system. What would you like to do?
            System.out.println("Welcome to the firework management system.");

            // 1) View all fireworks
            System.out.println("1) View all fireworks");
            // 2) View banned fireworks
            System.out.println("2) View banned fireworks");
            // 0) Exit
            System.out.println("0) Exit");

            System.out.print("What would you like to do? ");

            // 4) Get user input from scanner
            mainMenuCommand = scanner.nextInt();

            // 5) Create switch statement to handle different selected options
            switch(mainMenuCommand){
                case 1:
                    // 6) Add cases to handle selected option and run
                    System.out.println("Displaying all fireworks");
                    handleDisplayAllFireworks();
                    break;
                case 2:
                    System.out.println("Displaying all banned fireworks");
                    handleDisplayAllBannedFireworks();

                    // Begin nested menu! //////////////////////////////////////////////////

                        int bannedMenuCommand;
                        do{
                            System.out.println("What would you like to do?");
                            System.out.println("1) Edit");
                            System.out.println("0) Back");
                            bannedMenuCommand = scanner.nextInt();

                            switch (bannedMenuCommand){
                                case 1:
                                    handleEditBanProcess();
                                    break;
                                case 0:
                                    System.out.println("Going back to main menu");
                                    break;
                                default:
                                    System.out.println("Invalid command, try again");
                            }
                        } while(bannedMenuCommand != 0);

                    // End nested menu//////////////////////////////////////////////////

                    // TODO
                    // 1) Ban firework by providing an id
                    // 2) Back
                    break;
                case 0:
                    // 7) Add exiting message for 0
                    System.out.println("Exiting");
                    break;
                default:
                    // 8) Handle incorrect commands
                    System.out.println("Invalid command! Try again");
            }

            // 9) Define while condition for exiting
        } while(mainMenuCommand != 0);
    }

    private static void handleEditBanProcess() {
        System.out.print("Please enter a firework name: ");
        scanner.nextLine();
        String fireworkName = scanner.nextLine();
        for(Firework firework: fireworks){
            if(firework == null) continue;

            String currentFireworkName = firework.getName().trim();
            if(currentFireworkName.equalsIgnoreCase(fireworkName)){
                boolean currentlyIsBanned = firework.isBanned();
                firework.setBanned(!currentlyIsBanned);
                break;
            }
        }
    }

    private static void loadFireworks() {

        String[] names = {
                "M80", "Bottle Rocket", "Roman Candle", "Cherry Bomb",
                "Sparkler", "Fountain", "Catherine Wheel", "Skyrocket",
                "Firecracker", "Ground Spinner", "Smoke Bomb", "Party Popper",
                "Parachute", "Sky Lantern", "Flare", "Mortar Shell",
                "Festival Ball", "Snake", "Comet", "Cake"
        };

        for (int i = 0; i < names.length; i++) {
            fireworks[i] = new Firework(names[i]);
        }
    }


    private static void handleDisplayAllFireworks() {
        for(Firework firework: fireworks){
            if(firework == null) continue;
            if(!firework.isBanned()){
                System.out.println(firework.getName());
            }
        }
    }

    private static void handleDisplayAllBannedFireworks() {
        for(Firework firework: fireworks){
            if(firework == null) continue;
            if(firework.isBanned()){
                System.out.println(firework.getName());
            }
        }
    }
}