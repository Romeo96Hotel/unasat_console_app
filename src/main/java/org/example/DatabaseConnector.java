package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    static Connection con;

    public static Connection createDBConnection() {

        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/unasatdb";
            String username = "root";
            String password = "root";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
