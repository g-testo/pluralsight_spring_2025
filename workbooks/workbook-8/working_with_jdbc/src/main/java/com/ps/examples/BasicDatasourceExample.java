package com.ps.examples;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BasicDatasourceExample {
    public static void main(String[] args) {
        // Add your dependencies to the POM (2!!!) Mysql driver(Core) and dbcp(Data sources)
        // Config runner(Current File) for application with database username and password

        // Added db login validation
        if(args.length < 2){
            System.out.println("Username and password are required to run. Exiting...");
            System.exit(1);
        }
        String dbUsername = args[0];
        String dbPassword = args[1];

        // Created and setup the connection to our database
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/world");
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);

        // Try with resources
        String query = "SELECT name FROM country;";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while(resultSet.next()){
                String name = resultSet.getString("name");
                System.out.println(name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
