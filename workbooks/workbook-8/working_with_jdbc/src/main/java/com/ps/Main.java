package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        if(args.length < 2){
            System.out.println("Username and/or password is missing");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setUrl("jdbc:mysql://localhost:3306/world");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        WorldDataManager worldDataManager = new WorldDataManager(basicDataSource);

        List<Country> allCounties = worldDataManager.getAllCountries();

        allCounties.forEach(System.out::println);

    }
}
