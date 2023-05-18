package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TeamDAO implements TeamDAOInterface {
    Connection con;
    @Override
    public void createTeam(String teamName) {
        con = DatabaseConnector.createDBConnection();

        String query = "insert into teams values(?)";

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
    public void deleteTeam(String teamName) {

    }

    /*
    * Executes JOIN command
    * */
    @Override
    public void joinContestants(String contestant1, String contestant2) {
        con = DatabaseConnector.createDBConnection();

        String query = "insert into teams values(?)";
    }
}
