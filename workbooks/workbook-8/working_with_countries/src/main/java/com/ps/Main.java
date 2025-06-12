package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        if(args.length < 2){
            System.out.println("Give me args!!!");
            System.exit(1);
        }

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/world");
        basicDataSource.setUsername(args[0]);
        basicDataSource.setPassword(args[1]);
        CountryDAO countryDAO = new CountryDAO(basicDataSource);

        int mainCommand;

        do{
            System.out.println("What do you want to do?");
            System.out.println("1) Get All");
            System.out.println("2) Get By Code");
            System.out.println("3) Create country");
            System.out.println("4) Update country");
            System.out.println("5) Delete country");
            System.out.println("0) Exit");
            System.out.print("Option: ");
            mainCommand = scanner.nextInt();

            switch (mainCommand){
                case 1:
                    List<Country> countries = countryDAO.getAll();
                    System.out.println(countries);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Please provide a country code: ");
                    String code = scanner.nextLine();

                    if(code.length() > 3){
                        System.out.println("Code too long");
                        break;
                    }

                    Country country = countryDAO.getByCode(code);
                    System.out.println(country);
                    break;
                case 3:
                    System.out.println("Please provide the following");
                    System.out.print("Code: ");
                    String countryCode = scanner.nextLine();
                    System.out.print("Name: ");
                    String countryName = scanner.nextLine();
                    System.out.print("Population: ");
                    long countryPopulation = scanner.nextLong();

                    Country countryToCreate = new Country(countryCode, countryName, countryPopulation);

                    countryDAO.create(countryToCreate);

                    break;
                case 4:
                    System.out.print("Please provide the country code to update: ");
                    String countryCodeToUpdate = scanner.nextLine();

                    System.out.println("Please provide the information to update");
                    System.out.print("Name: ");
                    String countryNameToUpdate = scanner.nextLine();
                    System.out.print("Population: ");
                    long countryPopulationToUpdate = scanner.nextLong();

                    Country countryToUpdate = new Country("", countryNameToUpdate, countryPopulationToUpdate);

                    countryDAO.update(countryCodeToUpdate, countryToUpdate);
                    break;
                case 5:
                    System.out.print("Please provide the country code to delete: ");
                    String countryCodeToDelete = scanner.nextLine();

                    countryDAO.delete(countryCodeToDelete);
                    break;
                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Not valid command, try again");
            }
        } while(mainCommand != 0);

    }
}









