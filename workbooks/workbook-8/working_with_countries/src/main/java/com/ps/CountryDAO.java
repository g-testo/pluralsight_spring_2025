package com.ps;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
    // Datasource
    private DataSource dataSource;

    public CountryDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Country> getAll(){
        List<Country> countries = new ArrayList<>();

        String query = "SELECT * FROM country;";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ){
            if(resultSet.next()){
                do{
                    Country country = countryParser(resultSet);
                    countries.add(country);
                } while(resultSet.next());
            } else {
                System.out.println("No countries found");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }

        return countries;
    }

    public Country getByCode(String countryCode){

        String query = "SELECT * FROM country WHERE code = ?;";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, countryCode);

            try(
                ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                   return countryParser(resultSet);
                } else {
                    System.out.println("No country found");
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    public void create(Country country){

        String query = "INSERT INTO country(code, name, population) VALUES (?, ?, ?);";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, country.getCode());
            preparedStatement.setString(2, country.getName());
            preparedStatement.setLong(3, country.getPopulation());

            int rows = preparedStatement.executeUpdate();

            if(rows == 1){
                System.out.println("Country successfully created");
            } else {
                System.out.println("Country creation failed");
            }

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(String countryCode, Country country){
        String query = "UPDATE country SET name = ?, population = ? WHERE code = ?;";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, country.getName());
            preparedStatement.setLong(2, country.getPopulation());
            preparedStatement.setString(3, countryCode);

            int rows = preparedStatement.executeUpdate();

            if(rows == 1){
                System.out.println("Country successfully updated");
            } else {
                System.out.println("Country update failed");
            }

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(String countryCode){
        String query = "DELETE FROM country WHERE code = ?;";

        try(
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, countryCode);

            int rows = preparedStatement.executeUpdate();

            if(rows == 1){
                System.out.println("Country successfully deleted");
            } else {
                System.out.println("Country deletion failed");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    private Country countryParser(ResultSet resultSet) throws SQLException {
        String countryCode = resultSet.getString("code");
        String name = resultSet.getString("name");
        long population = resultSet.getLong("population");

        return new Country(countryCode, name, population);
    }

}



















