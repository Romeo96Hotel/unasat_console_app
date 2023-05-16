package org.example;

import java.sql.*;

public class ContestantDAO implements ContestantDAOInterface {
    Connection con;

    @Override
    public void createContestant(Contestant contestant) {
        con = DatabaseConnector.createDBConnection();

        String query = "insert into contestants values(?,?,?,?,?,?,?,?,?,?)";
        try {
            /*
             * 1) string - firstname
             * 2) string - last name
             * 3) string - student id
             * 4) int - age
             * 5) date - birthdate
             * 6) string - contact number
             * 7) string - team name
             * 8) address - email address
             * 9) string - home address
             * 10) String - ict skill-set
             * */
            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1, contestant.getFirstName());
            prep.setString(2, contestant.getLastName());
            prep.setString(3, contestant.getId());
            prep.setInt(4, contestant.getAge());
            prep.setString(5, contestant.getBirthday());
            prep.setString(6, contestant.getCtcNumber());
            prep.setString(7, contestant.getTeamName());
            prep.setString(8, contestant.getEmail());
            prep.setString(9, contestant.getAddress());
            prep.setString(10, contestant.getSkillSet());
            int count = prep.executeUpdate();
            if (count != 0) {
                System.out.println("Contestant inserted successfully");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteContestant(String name) {
        con = DatabaseConnector.createDBConnection();
        String query = "delete from contestants where id = ?";
        try {
            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1, name);
            int count = prep.executeUpdate();
            if (count != 0) {
                System.out.println("Successfully deleted contestant");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getAllContestants() {
        con = DatabaseConnector.createDBConnection();
        String query = "select * from contestants";
        try {
            Statement statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);
            while (results.next()) {
                System.out.println(
                        results.getString(1) + "\n" +
                                results.getString(2) + "\n" +
                                results.getString(3) + "\n" +
                                results.getInt(4) + "\n" +
                                results.getString(5) + "\n" +
                                results.getString(6) + "\n" +
                                results.getString(7) + "\n" +
                                results.getString(8) + "\n" +
                                results.getString(9) + "\n" +
                                results.getString(10)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getContestant(String name) {
        con = DatabaseConnector.createDBConnection();
        String query = "select * from contestants";
        try {
            Statement statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);
            while (results.next()) {
                System.out.println(
                        results.getString(1) + "\n" +
                                results.getString(2) + "\n" +
                                results.getString(3) + "\n" +
                                results.getInt(4) + "\n" +
                                results.getString(5) + "\n" +
                                results.getString(6) + "\n" +
                                results.getString(7) + "\n" +
                                results.getString(8) + "\n" +
                                results.getString(9) + "\n" +
                                results.getString(10)

                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
