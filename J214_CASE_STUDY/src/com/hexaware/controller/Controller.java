

package com.hexaware.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.hexaware.dao.Dao;
import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;

public abstract class Controller<IncidentID> implements ICrimeAnalysisService  {
	private List<Incidents> availableIncidents;
	private Object connection;
	public Controller() {
        availableIncidents = new ArrayList<>();
    }

	
	public void addIncidents(Incidents incident) {
		// TODO Auto-generated method stub
	        availableIncidents.add(incident);
	        System.out.println(" added to the list of available incidents: " + incident.toString());
	    }

	
	public void removeIncidents(Incidents incident) {
		// TODO Auto-generated method stub
		availableIncidents.remove(incident);
        System.out.println(" removed from the list of available incidents: " + incident.toString());
    }
	

	
	public void listAvailable() {
		// TODO Auto-generated method stub
		
		if (availableIncidents.isEmpty()) {
            System.out.println("No incidents found.");
        } else {
            System.out.println("Available incidents:");
            for (Incidents incident : availableIncidents) {
                System.out.println(incident);
            }
        }
		
	}
	public Incidents searchIncidentByID(int incidentID) {
        try {
            return Dao.searchIncidentByID(incidentID);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
            return null;
        }
    }
	
	public void generateIncidentReport(Incidents incident) {
        List<Reports> reports = ICrimeAnalysisService.generateIncidentReport(incident);
        if (reports.isEmpty()) {
            System.out.println("No reports found for the incident.");
        } else {
            System.out.println("Incident Reports:");
            for (Reports report : reports) {
                System.out.println(report); // Assuming Report class has a suitable toString() method
            }
        }
    }

	@Override
	public void addIncident(Incidents incident) {
		// TODO Auto-generated method stub
		
	}

	


	
	

}