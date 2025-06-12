package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.util.List;

public class Main {
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


//        List<Country> countries = countryDAO.getAll();
//        System.out.println(countries);


//        Country country = countryDAO.getByCode("UME");
//        System.out.println(country);

//        Country country = new Country("UME", "Ummetopia", 1);
//        countryDAO.create(country);

//        Country country = new Country("", "Ummetopia", 22);
//        countryDAO.update("UME", country);

//        countryDAO.delete("GRG");


    }
}









