package com.hexaware.controller;

import java.util.Collection;
import java.util.List;

import com.hexaware.entity.Incidents;
import com.hexaware.entity.Reports;

/**
 * Interface for a crime analysis service.
 * Defines methods for managing incidents and generating reports.
 */
public interface ICrimeAnalysisService {

    /**
     * Adds an incident.
     * 
     * @param incident The incident to be added.
     */
    public void addIncident(Incidents incident);

    /**
     * Removes an incident.
     * 
     * @param incident The incident to be removed.
     */
    public void removeIncident(Incidents incident);

    /**
     * Lists all available incidents.
     */
    public void listAvailable();

    /**
     * Searches for incidents.
     * 
     * @return A collection of incidents matching the search criteria.
     */
    public Collection<Incidents> searchIncidents();

    /**
     * Generates incident reports.
     * 
     * @param incident The incident for which reports are to be generated.
     * @return A list of reports generated for the incident.
     */
    public static List<Reports> generateIncidentReport(Incidents incident) {
        // TODO: Implement the logic to generate incident reports.
        // This method is a placeholder and does not contain any actual implementation.
        return null;
    }
}
