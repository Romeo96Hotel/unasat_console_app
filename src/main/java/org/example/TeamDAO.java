package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TeamDAO implements TeamDAOInterface {
    Connection con;

    //Create team with team name
    @Override
    public void createTeam(String teamName) {
        con = DatabaseConnector.createDBConnection();

        String query = "insert into teams (team_name) values (?)";

        try {
            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1, teamName);
            int count = prep.executeUpdate();
            if (count != 0) {
                System.out.println("Team inserted successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectTeam(String teamName) {
        con = DatabaseConnector.createDBConnection();

        String query = "select * from teams where team_name = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, teamName);
            ResultSet results = preparedStatement.executeQuery();

            while (results.next()) {
                System.out.println(
                        results.getInt(1) + "\n" +
                                results.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTeam(String teamName) {
        con = DatabaseConnector.createDBConnection();

        String query = "delete from teams where team_name = ?";

        try {
            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1, teamName);
            int count = prep.executeUpdate();
            if (count != 0) {
                System.out.println("Team removed successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
