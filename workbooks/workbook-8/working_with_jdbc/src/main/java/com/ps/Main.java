package com.ps;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/sakila",
                    "root",
                    "password"
            );
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM film;";

            ResultSet resultSet = statement.executeQuery(query);

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
