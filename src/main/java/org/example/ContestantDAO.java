package org.example;

import java.sql.*;

public class ContestantDAO implements ContestantDAOInterface {
    Connection con;

    @Override
    public void createContestant(Contestant contestant) {
        con = DatabaseConnector.createDBConnection();

        String query = "insert into contestants values(?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1, contestant.getId());
            prep.setString(2, contestant.getFirstName());
            prep.setString(3, contestant.getLastName());
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
    public void getAllContestants() {
        con = DatabaseConnector.createDBConnection();
        String query = "select * from contestants";
        try {
            Statement statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);
            while (results.next()) {
                System.out.println(
                        "Contestant id: " + results.getString(1) + "\n" +
                                "Contestant first name: " + results.getString(2) + "\n" +
                                "Contestant last name: " + results.getString(3) + "\n" +
                                "Contestant age: " + results.getInt(4) + "\n" +
                                "Contestant DOB: " + results.getString(5) + "\n" +
                                "Contestant Contact number: " + results.getString(6) + "\n" +
                                "Contestant team name: " + results.getString(7) + "\n" +
                                "Contestant email address: " + results.getString(8) + "\n" +
                                "Contestant home address: " + results.getString(9) + "\n" +
                                "Contestant ict skill-set: " + results.getString(10)
                );

                System.out.println("--------------------------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getContestant(String name) {
        con = DatabaseConnector.createDBConnection();
        String query = "select * from contestants where student_id = ?";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, name);
            ResultSet results = statement.executeQuery();
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
