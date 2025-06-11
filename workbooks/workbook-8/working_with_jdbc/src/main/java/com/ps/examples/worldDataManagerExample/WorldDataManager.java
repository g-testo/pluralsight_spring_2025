package com.ps.examples.worldDataManagerExample;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorldDataManager {
    private DataSource dataSource;

    public WorldDataManager(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Country> getAllCountries(){
        List<Country> countries = new ArrayList<>();

        String query = "SELECT name, population, capital FROM country;";

        try(
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
        ){
//            [1,2,3,4,5,6,7]
//            null - (1) -> (2) -> (3) ... (6)
            while(resultSet.next()){
                String name = resultSet.getString("name");
                long population = resultSet.getLong("population");
                String capital = resultSet.getString("capital");

                Country country = new Country(name, population, capital);
                countries.add(country);
            }

        } catch(SQLException e){
            e.printStackTrace();
        }

        return countries;
    }


}
