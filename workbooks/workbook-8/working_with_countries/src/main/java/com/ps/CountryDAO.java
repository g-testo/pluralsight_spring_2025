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

    public List<Country> getAllCountries(){
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

    public Country getCountryByCode(String countryCode){

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

    private Country countryParser(ResultSet resultSet) throws SQLException {
        String countryCode = resultSet.getString("code");
        String name = resultSet.getString("name");
        long population = resultSet.getLong("population");

        return new Country(countryCode, name, population);
    }

}



















