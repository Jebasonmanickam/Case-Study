
package com.hexaware.controller;

import java.util.Collection;
import java.util.List;

import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;

public interface ICrimeAnalysisService {
	public void addIncident(Incidents incident);
	public void removePet(Incidents incident);
	public void listAvailable();
	public Collection<Incidents> searchIncidents();
	public static List<Reports> generateIncidentReport(Incidents incident) {
		// TODO Auto-generated method stub
		return null;
	}	

}