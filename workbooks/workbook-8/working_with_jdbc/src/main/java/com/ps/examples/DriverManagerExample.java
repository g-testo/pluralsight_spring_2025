package com.ps.examples;

import java.sql.*;
import java.util.Scanner;

public class DriverManagerExample {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Please provide a film id: ");
        String filmId = scanner.nextLine();

        String query = "SELECT * FROM film WHERE film_id = ?";

        try(
// BAD
//            Statement statement = connection.createStatement();
//            String query = "SELECT * FROM film WHERE film_id = " + filmId + ";";
//            ResultSet resultSet = statement.executeQuery(query);
// /BAD
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sakila",
                        args[0],
                        args[1]
                );
                PreparedStatement statement = connection.prepareStatement(query);

        ) {



// GOOD
            statement.setString(1,filmId);
            ResultSet resultSet = statement.executeQuery();
// /GOOD
            while(resultSet.next()){
                String name = resultSet.getString("title");
                System.out.println(name);
            }

            connection.close();
            statement.close();
            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
