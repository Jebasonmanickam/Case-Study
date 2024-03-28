

package com.hexaware.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.dao.Dao;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;

/**
 * This abstract class represents a controller for managing crime analysis service.
 * It provides methods to interact with incidents and reports.
 */
public abstract class Controller<IncidentID> implements ICrimeAnalysisService {

    /**
     * List to store available incidents.
     */
    private List<Incidents> availableIncidents;

    /**
     * Placeholder for database connection.
     */
    private Object connection;

    /**
     * Default constructor to initialize availableIncidents list.
     */
    public Controller() {
        availableIncidents = new ArrayList<>();
    }

    // Methods and implementations will go here...


	
    /**
     * Adds an incident to the list of available incidents.
     * 
     * @param incident The incident to be added.
     */
    public void addIncidents(Incidents incident) {
        // Adds the provided incident to the list of available incidents.
        availableIncidents.add(incident);
        
        // Prints a message indicating the incident has been added to the list.
        System.out.println("Incident added to the list of available incidents: " + incident.toString());
    }


	
    /**
     * Removes an incident from the list of available incidents.
     * 
     * @param incident The incident to be removed.
     */
    public void removeIncidents(Incidents incident) {
        // Removes the provided incident from the list of available incidents.
        availableIncidents.remove(incident);
        
        // Prints a message indicating the incident has been removed from the list.
        System.out.println("Incident removed from the list of available incidents: " + incident.toString());
    }

	

	
    /**
     * Lists all available incidents.
     * If no incidents are available, it prints a message indicating so.
     */
    public void listAvailable() {
        // Checks if the list of available incidents is empty.
        if (availableIncidents.isEmpty()) {
            // Prints a message indicating that no incidents are found.
            System.out.println("No incidents found.");
        } else {
            // Prints a message indicating that available incidents will be listed.
            System.out.println("Available incidents:");
            
            // Iterates over each incident in the list of available incidents.
            for (Incidents incident : availableIncidents) {
                // Prints the details of each incident.
                System.out.println(incident);
            }
        }
    }

    /**
     * Searches for an incident by its ID.
     * 
     * @param incidentID The ID of the incident to search for.
     * @return The incident with the specified ID if found, or null if not found or an SQL exception occurs.
     */
    public Incidents searchIncidentByID(int incidentID) {
        try {
            // Calls the DAO method to search for the incident by its ID.
            return Dao.searchIncidentByID(incidentID);
        } catch (SQLException e) {
            // Prints the stack trace of the SQL exception.
            e.printStackTrace();
            
            // Handle the SQL exception appropriately
            // In this implementation, it simply returns null.
            return null;
        }
    }

	
    /**
     * Generates incident reports for the specified incident.
     * 
     * @param incident The incident for which reports are to be generated.
     */
    public void generateIncidentReport(Incidents incident) {
        // Calls the method to generate incident reports from the crime analysis service.
        List<Reports> reports = ICrimeAnalysisService.generateIncidentReport(incident);
        
        // Checks if any reports are generated.
        if (reports.isEmpty()) {
            // Prints a message indicating that no reports are found for the incident.
            System.out.println("No reports found for the incident.");
        } else {
            // Prints the incident reports.
            System.out.println("Incident Reports:");
            for (Reports report : reports) {
                // Prints the details of each report.
                System.out.println(report); // Assuming Report class has a suitable toString() method
            }
        }
    }

    /**
     * Adds an incident to the controller.
     * 
     * @param incident The incident to be added.
     */
    @Override
    public void addIncident(Incidents incident) {
        // TODO: Implement the logic to add the incident to the controller.
        // This method is currently a placeholder and does not contain any implementation.
    }


}