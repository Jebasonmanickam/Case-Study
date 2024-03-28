package com.hexaware.dao;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

//import com.hexaware.controller.Controller;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;
import com.hexaware.myexceptions.IncidentNumberNotFoundException;
import com.hexaware.util.DBUtil;

/**
 * Data Access Object (DAO) class for interacting with the database.
 * Provides methods for CRUD operations on incidents and reports.
 */
public class Dao {
    
    static Connection con;
    PreparedStatement ps;
    Statement stmt;
    ResultSet rs;
    private List<Incidents> availableIncidents;

    // Constructors, methods, and implementations will go here...


    /**
     * Adds an incident to the database.
     * 
     * @param incident The incident to be added.
     * @throws IncidentNumberNotFoundException If the incident number is not found.
     * @throws SQLException If a SQL exception occurs while executing the query.
     */
    public void addIncident(Incidents incident) throws IncidentNumberNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement statement = null;
        try {
            // Establishes a database connection.
            con = DBUtil.getDBConn();
            
            // SQL query to insert an incident into the database.
            String query = "INSERT INTO Incidents (IncidentID, IncidentType, IncidentDate, Latitude, Longitude, Description, Status, VictimID, SuspectID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Prepares the statement.
            statement = con.prepareStatement(query);
            
            // Sets values for the parameters in the SQL query.
            statement.setInt(1, incident.getID());
            statement.setString(2, incident.getType());
            statement.setString(3, incident.getDate());
            statement.setDouble(4, incident.getLati());
            statement.setDouble(5, incident.getLongi());
            statement.setString(6, incident.getDes());
            statement.setString(7, incident.getStatus());
            statement.setInt(8, incident.getVicID());
            statement.setInt(9, incident.getSuspID());

            // Executes the update.
            int rowsInserted = statement.executeUpdate();
            
            // Checks if the incident was successfully inserted.
            if (rowsInserted > 0) {
                System.out.println("A new incident was added!");
            }
        } finally {
            // Closes the statement and connection.
            if (statement != null) {
                statement.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
	
    /**
     * Removes an incident from the database by its ID.
     * 
     * @param id The ID of the incident to be removed.
     * @throws SQLException If a SQL exception occurs while executing the query.
     */
    public void removeInci(String id) throws SQLException {
        Connection con = null;
        try {
            // Establishes a database connection.
            con = DBUtil.getDBConn();
            
            // SQL query to delete an incident from the database by its ID.
            String query = "DELETE FROM Incidents WHERE IncidentID = ?";
            
            // Prepares the statement.
            try (PreparedStatement statement = con.prepareStatement(query)) {
                // Sets the ID parameter in the SQL query.
                statement.setString(1, id);
                
                // Executes the update.
                int rowsDeleted = statement.executeUpdate();
                
                // Checks if the incident was successfully deleted.
                if (rowsDeleted > 0) {
                    System.out.println("The incident was removed!");
                }
            }
        } finally {
            // Closes the connection.
            if (con != null) {
                con.close();
            }
        }
    }
	
	


    /**
     * Retrieves a list of available incidents from the database.
     * 
     * @return A list of available incidents.
     * @throws SQLException If a SQL exception occurs while executing the query.
     */
    public List<Incidents> listAvailable() throws SQLException {
        Connection con = null;
        List<Incidents> availableIncidents = new ArrayList<>();
        try {
            // Establishes a database connection.
            con = DBUtil.getDBConn();
            
            // SQL query to select all incidents from the database.
            String query = "SELECT * FROM Incidents";
            
            // Prepares the statement and executes the query.
            try (PreparedStatement statement = con.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                // Iterates through the result set and creates Incident objects.
                while (resultSet.next()) {
                    Incidents incident = new Incidents(
                            resultSet.getInt("IncidentID"),
                            resultSet.getString("IncidentType"),
                            resultSet.getString("IncidentDate"),
                            resultSet.getDouble("Latitude"),
                            resultSet.getDouble("Longitude"),
                            resultSet.getString("Description"),
                            resultSet.getString("Status"),
                            resultSet.getInt("VictimID"),
                            resultSet.getInt("SuspectID")
                    );
                    // Sets additional attributes of the Incident object.
                    incident.setID(resultSet.getInt("IncidentID"));
                    incident.setType(resultSet.getString("IncidentType"));
                    incident.setDate(resultSet.getString("IncidentDate"));
                    incident.setLati(resultSet.getDouble("Latitude"));
                    incident.setLongi(resultSet.getDouble("Longitude"));
                    incident.setDes(resultSet.getString("Description"));
                    incident.setStatus(resultSet.getString("Status"));
                    incident.setVicID(resultSet.getInt("VictimID"));
                    incident.setSuspID(resultSet.getInt("SuspectID"));
                    
                    // Adds the Incident object to the list of available incidents.
                    availableIncidents.add(incident);
                }
            }
        } finally {
            // Closes the connection.
            if (con != null) {
                con.close();
            }
        }
        return availableIncidents;
    }


    /**
     * Searches for an incident by its ID in the database.
     * 
     * @param incidentID The ID of the incident to search for.
     * @return The incident with the specified ID if found, or null if not found.
     * @throws SQLException If a SQL exception occurs while executing the query.
     */
    public static Incidents searchIncidentByID(int incidentID) throws SQLException {
        Incidents incident = null;
        Connection con = null;
        try {
            // Establishes a database connection.
            con = DBUtil.getDBConn();
            
            // SQL query to select an incident from the database by its ID.
            String query = "SELECT * FROM Incidents WHERE IncidentID = ?";
            
            // Prepares the statement and executes the query.
            try (PreparedStatement statement = con.prepareStatement(query)) {
                // Sets the ID parameter in the SQL query.
                statement.setInt(1, incidentID);
                
                // Executes the query and retrieves the result set.
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Checks if an incident with the specified ID was found.
                    if (resultSet.next()) {
                        // Creates an Incident object with the retrieved data.
                        incident = new Incidents(
                                resultSet.getInt("IncidentID"),
                                resultSet.getString("IncidentType"),
                                resultSet.getString("IncidentDate"),
                                resultSet.getDouble("Latitude"),
                                resultSet.getDouble("Longitude"),
                                resultSet.getString("Description"),
                                resultSet.getString("Status"),
                                resultSet.getInt("VictimID"),
                                resultSet.getInt("SuspectID")
                        );
                        // Sets additional attributes of the Incident object.
                        incident.setID(resultSet.getInt("IncidentID"));
                        incident.setType(resultSet.getString("IncidentType"));
                        incident.setDate(resultSet.getString("IncidentDate"));
                        incident.setLati(resultSet.getDouble("Latitude"));
                        incident.setLongi(resultSet.getDouble("Longitude"));
                        incident.setDes(resultSet.getString("Description"));
                        incident.setStatus(resultSet.getString("Status"));
                        incident.setVicID(resultSet.getInt("VictimID"));
                        incident.setSuspID(resultSet.getInt("SuspectID"));
                    }
                }
            }
        } finally {
            // Closes the connection.
            if (con != null) {
                con.close();
            }
        }
        return incident;
    }

    /**
     * Generates incident reports for the specified incident.
     * 
     * @param incident The incident for which reports are to be generated.
     * @return A list of reports generated for the incident.
     * @throws SQLException If a SQL exception occurs while executing the query.
     */
    public List<Reports> generateIncidentReport(Incidents incident) throws SQLException {
        List<Reports> reports = new ArrayList<>();
        try {
            // Define the SQL query to retrieve incident report data
            String sql = "SELECT * FROM reports WHERE IncidentID = ?";
            
            // Create a PreparedStatement
            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                // Set the incident ID parameter
                preparedStatement.setInt(1, incident.getID());
                
                // Execute the query
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Iterate through the result set and map each row to a Report object
                    while (resultSet.next()) {
                        // Retrieve report attributes from the result set
                        int reportId = resultSet.getInt("ReportID");
                        // Retrieve other report attributes similarly
                       
                        // Create a Report object
                        Reports report = new Reports(
                                resultSet.getInt("ReportID"),
                                resultSet.getInt("IncidentID"),
                                resultSet.getString("ReportingOfficer"),
                                resultSet.getDate("ReportDate"),
                                resultSet.getString("ReportDetails"),
                                resultSet.getString("Status")
                        );
                        
                        // Add the report to the list
                        reports.add(report);
                    }
                }
            }
        } catch (SQLException e) {
            // Handle the SQL exception properly
            e.printStackTrace();
        }
        return reports;
    }



}