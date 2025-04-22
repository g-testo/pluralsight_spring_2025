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

        int mainMenuCommand;
        do{
            // Welcome to the firework management system. What would you like to do?
            System.out.println("Welcome to the firework management system.");

            // 1) View all fireworks
            System.out.println("1) View all fireworks");
            // 2) View banned fireworks
            System.out.println("2) View banned fireworks");
            // 0) Exit
            System.out.println("0) Exit");

            System.out.print("What would you like to do? ");

            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    System.out.println("Displaying all fireworks");
                    handleDisplayAllFireworks();
                    break;
                case 2:
                    System.out.println("Displaying all banned fireworks");
                    handleDisplayAllBannedFireworks();
                    // TODO
                    // 1) Ban firework by providing an id
                    // 2) Back
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid command! Try again");
            }

        } while(mainMenuCommand != 0);


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

    }
}