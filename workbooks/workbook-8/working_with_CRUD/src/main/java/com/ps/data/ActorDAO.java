package com.ps.data;

import com.ps.models.Actor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO implements ActorDaoInt {
    private DataSource dataSource;

    public ActorDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();

        String query = "SELECT actor_id, first_name, last_name FROM actor;";

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            if (resultSet.next()) {
                do {
                    int actorId = resultSet.getInt("actor_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");

                    Actor actor = new Actor(actorId, firstName, lastName);
                    actors.add(actor);
                } while (resultSet.next());
            } else {
                System.out.println("No records found");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return actors;
    }
}
