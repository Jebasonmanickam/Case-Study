package com.hexaware.Main;
import java.util.*;


import java.sql.SQLException;

import com.hexaware.myexceptions.IncidentNumberNotFoundException;
import com.hexaware.dao.Dao;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;

public class MainMethod {
    private static Dao incidentController;

	public static void main(String[] args) throws SQLException, IncidentNumberNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Dao crimeDao = new Dao();

        int choice = 0;

        do {
            System.out.println("1. Add an Incident");
            System.out.println("2. Remove an Incident");
            System.out.println("3. list all Incidents");
            System.out.println("4. Search by id");
            System.out.println("5. generate report");
            System.out.println("6. Exit");






            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
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
                     //   System.out.print("Agency ID: ");
                     //   int agencyID = scanner.nextInt();

                        Incidents incident = new Incidents(incidentID, incidentType, incidentDate, latitude, longitude, description, status, victimID, suspectID); //agencyID
                        crimeDao.addIncident(incident);
                        System.out.println("Incident added successfully!");
                        break;
                        
                    case 2:
                        
                        System.out.println("Enter the ID to remove:");
                        String NameToRemove = scanner.nextLine();

                        
                        crimeDao.removeInci(NameToRemove);
                        
                        System.out.println("name: '" + NameToRemove + "' has been removed.");
                        break;
                        
                    case 3:
                        
                        List<Incidents> availableIncidents = crimeDao.listAvailable();

                        if (availableIncidents.isEmpty()) {
                            System.out.println("No incidents");
                        } else {
                            System.out.println("Available Incidents");
                            for (Incidents incidents : availableIncidents) {
                            	System.out.println("Id: " + incidents.getID());
                            	System.out.println("Type: " + incidents.getType());
                            	System.out.println("Incident Date: " + incidents.getDate());
                            	System.out.println("Latitude: " + incidents.getLati());
                            	System.out.println("Longitude: " + incidents.getLongi());
                            	System.out.println("Description: " + incidents.getDes());
                            	System.out.println("Status: " + incidents.getStatus());
                            	System.out.println("VictimId: " + incidents.getVicID());
                            	System.out.println("SuspectID: " + incidents.getSuspID());
                            //	System.out.println("AgencyID: " + incidents.getAgencyID());

                                
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter Incident ID to search:");
                        System.out.print("Incident ID: ");
                        int searchIncidentID = Integer.parseInt(scanner.nextLine());
                        Incidents foundIncident = incidentController.searchIncidentByID(searchIncidentID);
                        if (foundIncident != null) {
                            System.out.println("Incident found:");
                            System.out.println(foundIncident);
                        } else {
                            System.out.println("Incident with ID " + searchIncidentID + " not found.");
                        }
                        break;
                        
                    
                        
                    case 5:
                        System.out.println("Enter Incident ID to generate report:");

                        System.out.println("Incident ID: ");
                        int IncidentID = Integer.parseInt(scanner.nextLine());
                        Incidents incident1 = crimeDao.searchIncidentByID(IncidentID);
                        if (incident1 != null) {
                            List<Reports> reportsList = crimeDao.generateIncidentReport(incident1);
                            for (Reports report : reportsList) {
                                System.out.println(report);
                            }
                        } else {
                            System.out.println("Incident with ID " + IncidentID + " not found.");
                        }
                        break;
                        
                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1 to add an incident.");
                }
            } catch (IncidentNumberNotFoundException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine(); 
            }
        } while (choice != 6);

        scanner.close();
    }
}
