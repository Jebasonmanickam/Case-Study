package com.hexaware.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.hexaware.controller.Controller;
import com.hexaware.myexceptions.IncidentNumberNotFoundException;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;
import com.hexaware.util.DBUtil;
import com.hexaware.entity.*;
public class Dao {
	
	static Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	private List<Incidents> availableIncidents;
	public void addIncident(Incidents Incidents) throws IncidentNumberNotFoundException, SQLException {
		con = DBUtil.getDBConn();
        String query = "INSERT INTO Incidents (IncidentID, IncidentType, IncidentDate,Latitude,Longitude,Description, Status, VictimID, SuspectID) VALUES (?, ?, ?,?,?,?,?,?,?)";
        try (PreparedStatement statement = con.prepareStatement(query)) {                                                                     //AgencyID
        	statement.setInt(1, Incidents.getID());
            statement.setString(2, Incidents.getType());
            statement.setString(3, Incidents.getDate());
            statement.setDouble(4, Incidents.getLati());
            statement.setDouble(5, Incidents.getLongi());
            statement.setString(6, Incidents.getDes());
            statement.setString(7, Incidents.getStatus());
        	statement.setInt(8, Incidents.getVicID());
        	statement.setInt(9, Incidents.getSuspID());
        //	statement.setInt(10, Incidents.getAgencyID());


            

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new incident was added!");
            }
        }
    }
	
	public void removeInci(String id) throws SQLException {
		con = DBUtil.getDBConn();
        String query = "DELETE FROM Incidents WHERE IncidentID = ?";
        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The name was removed!");
            }
        }
    }
	
	


public List<Incidents> listAvailable() throws SQLException {
	con = DBUtil.getDBConn();
    List<Incidents> availableIncidents = new ArrayList<>();
    String query = "SELECT * FROM Incidents ";
    try (PreparedStatement statement = con.prepareStatement(query);
         ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            Incidents incident = new Incidents(resultSet.getInt("IncidentID"), resultSet.getString("IncidentType"), resultSet.getString("IncidentDate"), resultSet.getDouble("Latitude"), resultSet.getDouble("Longitude"), resultSet.getString("Description"), resultSet.getString("Status"), resultSet.getInt("VictimID"), resultSet.getInt("SuspectID"));   //, resultSet.getInt("AgencyID")
            incident.setID(resultSet.getInt("IncidentID"));
            incident.setType(resultSet.getString("IncidentType"));
            incident.setDate(resultSet.getString("IncidentDate"));
            incident.setLati(resultSet.getDouble("Latitude"));
            incident.setLongi(resultSet.getDouble("Longitude"));
            incident.setDes(resultSet.getString("Description"));
            incident.setStatus(resultSet.getString("Status"));
            incident.setVicID(resultSet.getInt("VictimID"));
            incident.setSuspID(resultSet.getInt("SuspectID"));
           // incident.setAgencyID(resultSet.getInt("AgencyID"));
            
            availableIncidents.add(incident);
        }
    }
    return availableIncidents;
}


	public static Incidents searchIncidentByID(int incidentID) throws SQLException {
 Incidents incident = null;
 con = DBUtil.getDBConn();
 String query = "SELECT * FROM Incidents WHERE IncidentID = ?";
 try (PreparedStatement statement = con.prepareStatement(query)) {
     statement.setInt(1, incidentID);
     try (ResultSet resultSet = statement.executeQuery()) {
         if (resultSet.next()) {
             incident = new Incidents(resultSet.getInt("IncidentID"),
                                      resultSet.getString("IncidentType"),
                                      resultSet.getString("IncidentDate"),
                                      resultSet.getDouble("Latitude"),
                                      resultSet.getDouble("Longitude"),
                                      resultSet.getString("Description"),
                                      resultSet.getString("Status"),
                                      resultSet.getInt("VictimID"),
                                      resultSet.getInt("SuspectID"));
                                      //resultSet.getInt("AgencyID"));
         }
     }
 }
 return incident;
	}
	 public List<Reports> generateIncidentReport(Incidents incident)throws SQLException {
	        List<Reports> reports = new ArrayList<>();

	        try {
	            // Define the SQL query to retrieve incident report data
	            String sql = "SELECT * FROM reports WHERE IncidentID = ?";
	            
	            // Create a PreparedStatement
	            PreparedStatement preparedStatement = con.prepareStatement(sql);
	            
	            // Set the incident ID parameter
	            preparedStatement.setInt(1, incident.getID());
	            
	            // Execute the query
	            ResultSet resultSet = preparedStatement.executeQuery();
	            
	            // Iterate through the result set and map each row to a Report object
	            while (resultSet.next()) {
	                int reportId = resultSet.getInt("ReportID");
	                // Retrieve other report attributes similarly
	                
	                // Create a Report object
	                Reports report = new Reports(resultSet.getInt("ReportID"),
                            resultSet.getInt("IncidentID"),
                            resultSet.getString("ReportingOfficer"),
                            resultSet.getDate("ReportDate"),
                            resultSet.getString("ReportDetails"),
                            resultSet.getString("Status"));
	               
	                
	                // Add the report to the list
	                reports.add(report);
	            }
	            
	            // Close the resources
	            resultSet.close();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace(); // Handle the exception properly
	        }

	        return reports;
	    }

	

	




}