package com.hexaware.Main;
import java.util.*;


import java.sql.SQLException;

import com.hexaware.myexceptions.IncidentNumberNotFoundException;
import com.hexaware.dao.Dao;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;
import com.hexaware.myexceptions.IncidentNumberNotFoundException;
import com.hexaware.dao.Dao;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;
/**
 * Main class containing the entry point for the application.
 * 
 * <p>This class serves as the entry point for the application and contains the main method to
 * start the execution of the program. It initializes necessary components and interacts with
 * other classes to perform various operations related to incident management.
 */
public class MainMethod {
	private static Dao incidentController;
    /**
     * The entry point for the application.
     * 
     * @param args Command-line arguments passed to the program.
     */

	/**
	 * The main entry point for the application.
	 * 
	 * <p>This method initializes necessary components and handles user interactions for incident management.
	 * It prompts the user for input and invokes appropriate methods to perform operations related to incident management.
	 * 
	 * @param args Command-line arguments passed to the program.
	 * @throws SQLException If a SQL exception occurs during database operations.
	 * @throws IncidentNumberNotFoundException If an incident number is not found during database operations.
	 */
	public static void main(String[] args) throws SQLException, IncidentNumberNotFoundException {
	    // Initializes a scanner to read user input
	    Scanner scanner = new Scanner(System.in);
	    
	    // Creates an instance of the DAO class for database operations
	    Dao crimeDao = new Dao();

	    // Main method implementation will go here
	    int choice = 0;

        do {
        	// Display menu options and prompt for user choice
        	System.out.println("1. Add an Incident");
        	System.out.println("2. Remove an Incident");
        	System.out.println("3. List all Incidents");
        	System.out.println("4. Search by ID");
        	System.out.println("5. Generate report");
        	System.out.println("6. Exit");
        	System.out.print("Enter your choice: ");

        	try {
        	    // Parse user input as integer
        	    choice = Integer.parseInt(scanner.nextLine());

        	    // Process user choice
        	    switch (choice) {
        	        case 1:
        	            // Add an incident
        	            System.out.println("Enter incident details:");
        	            System.out.print("Incident ID: ");
        	            int incidentID = scanner.nextInt();
        	            scanner.nextLine(); 
        	            System.out.print("Incident Type: ");
        	            String incidentType = scanner.nextLine();
        	            System.out.print("Incident Date: ");
        	            String incidentDate = scanner.nextLine();
        	            System.out.print("Latitude: ");
        	            float latitude = scanner.nextFloat();
        	            System.out.print("Longitude: ");
        	            float longitude = scanner.nextFloat();
        	            scanner.nextLine(); 
        	            System.out.print("Description: ");
        	            String description = scanner.nextLine();
        	            System.out.print("Status: ");
        	            String status = scanner.nextLine();
        	            System.out.print("Victim ID: ");
        	            int victimID = scanner.nextInt();
        	            System.out.print("Suspect ID: ");
        	            int suspectID = scanner.nextInt();
        	            Incidents incident = new Incidents(incidentID, incidentType, incidentDate, latitude, longitude, description, status, victimID, suspectID);
        	            crimeDao.addIncident(incident);
        	            System.out.println("Incident added successfully!");
        	            break;

                        
        	        case 2:
        	            // Remove an incident
        	            System.out.println("Enter the ID to remove:");
        	            String idToRemove = scanner.nextLine();

        	            // Invoke DAO method to remove the incident
        	            crimeDao.removeInci(idToRemove);
        	            
        	            // Confirmation message
        	            System.out.println("Incident with ID '" + idToRemove + "' has been removed.");
        	            break;

                        
        	        case 3:
        	            // List all available incidents
        	            List<Incidents> availableIncidents = crimeDao.listAvailable();

        	            // Check if the list of available incidents is empty
        	            if (availableIncidents.isEmpty()) {
        	                System.out.println("No incidents");
        	            } else {
        	                // Print available incidents
        	                System.out.println("Available Incidents:");
        	                for (Incidents incidents : availableIncidents) {
        	                    // Print details of each incident
        	                    System.out.println("Id: " + incidents.getID());
        	                    System.out.println("Type: " + incidents.getType());
        	                    System.out.println("Incident Date: " + incidents.getDate());
        	                    System.out.println("Latitude: " + incidents.getLati());
        	                    System.out.println("Longitude: " + incidents.getLongi());
        	                    System.out.println("Description: " + incidents.getDes());
        	                    System.out.println("Status: " + incidents.getStatus());
        	                    System.out.println("Victim ID: " + incidents.getVicID());
        	                    System.out.println("Suspect ID: " + incidents.getSuspID());
        	                    // System.out.println("AgencyID: " + incident.getAgencyID());
        	                    System.out.println(); // Add a blank line between incidents
        	                }
        	            }       	      
                        break;
        	        case 4:
        	            // Search for an incident by ID
        	            System.out.println("Enter Incident ID to search:");
        	            System.out.print("Incident ID: ");
        	            int searchIncidentID = Integer.parseInt(scanner.nextLine());
        	            
        	            // Invoke method to search for incident by ID
        	            Incidents foundIncident = incidentController.searchIncidentByID(searchIncidentID);
        	            
        	            // Check if the incident is found
        	            if (foundIncident != null) {
        	                // Print details of the found incident
        	                System.out.println("Incident found:");
        	                System.out.println(foundIncident);
        	            } else {
        	                // Print message if incident is not found
        	                System.out.println("Incident with ID " + searchIncidentID + " not found.");
        	            }
        	            break;

                        
                    
                        
        	        case 5:
        	            // Generate report for an incident
        	            System.out.println("Enter Incident ID to generate report:");
        	            System.out.print("Incident ID: ");
        	            int IncidentID = Integer.parseInt(scanner.nextLine());
        	            
        	            // Search for the incident by ID
        	            Incidents incident1 = crimeDao.searchIncidentByID(IncidentID);
        	            
        	            // Check if the incident is found
        	            if (incident1 != null) {
        	                // Generate report for the incident
        	                List<Reports> reportsList = crimeDao.generateIncidentReport(incident1);
        	                
        	                // Print the generated reports
        	                if (!reportsList.isEmpty()) {
        	                    System.out.println("Incident Reports:");
        	                    for (Reports report : reportsList) {
        	                        System.out.println(report);
        	                    }
        	                } else {
        	                    System.out.println("No reports found for the incident.");
        	                }
        	            } else {
        	                // Print message if incident is not found
        	                System.out.println("Incident with ID " + IncidentID + " not found.");
        	            }
        	            break;

                        
        	        case 6:
        	            // Exit the program
        	            System.out.println("Exiting...");
        	            break;
        	        default:
        	            // Handle invalid menu choice
        	            System.out.println("Invalid choice. Please enter a number from 1 to 6.");

                }
            } catch (IncidentNumberNotFoundException e) {
                // Handle the custom exception for invalid input
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine(); // Clear the input buffer
            } 
           
        } // Continue looping until the user chooses to exit (choice = 6)
        while (choice != 6);

     // Close the scanner to release associated resources
     scanner.close();
    }
}
