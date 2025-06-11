package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

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

        basicDataSource.setUrl("jdbc:mysql://localhost:3306/sakila");

        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        SakilaDataManager sakilaDataManager = new SakilaDataManager(basicDataSource);

        List<Actor> actorsDb = sakilaDataManager.searchActorsByName("kjsdhjsdfhkjfdskjhfkj");

        System.out.println(actorsDb);

    }
}
