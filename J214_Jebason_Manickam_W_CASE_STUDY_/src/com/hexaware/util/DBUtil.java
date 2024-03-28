package com.hexaware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class for managing database connections.
 * 
 * <p>This class provides a method to establish a connection to the database using JDBC.
 */
public class DBUtil {
    
    private static Connection con;

    /**
     * Retrieves a connection to the database.
     * 
     * @return A Connection object representing the database connection.
     */
    public static Connection getDBConn() {
        try {
            // Establish a connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Casestudy", "root", "JeBaZ_03#");
        } catch (SQLException e) {
            // Print stack trace for any SQLException that occurs
            e.printStackTrace();
        }
        return con;
    }

    /**
     * Main method to test the database connection.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Test the database connection by calling getDBConn() method
        System.out.println(getDBConn());
    }
}
