package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Add your dependencies to the POM (2!!!) Mysql driver(Core) and dbcp(Data sources)
        // Config runner(Current File) for application with database username and password

        //
        if(args.length < 2){
            System.out.println("Username and password are required to run. Exiting...");
            System.exit(1);
        }
        String dbUsername = args[0];
        String dbPassword = args[1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/world");
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);


    }
}
