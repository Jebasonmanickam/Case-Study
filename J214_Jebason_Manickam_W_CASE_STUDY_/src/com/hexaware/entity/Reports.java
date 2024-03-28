package com.hexaware.entity;

import java.util.Date;

/**
 * Represents a report related to an incident.
 */
public class Reports {
    private int ReportID; // Unique identifier for the report
    private int IncidentID; // Identifier for the related incident
    private String ReportingOfficer; // Name of the officer who filed the report
    private Date ReportDate; // Date when the report was filed
    private String ReportDetails; // Details of the report
    private String Status; // Status of the report

    /**
     * Constructs a new Reports object with the specified attributes.
     *
     * @param ReportID          The unique identifier for the report.
     * @param IncidentID        The identifier for the related incident.
     * @param ReportingOfficer  The name of the officer who filed the report.
     * @param ReportDate        The date when the report was filed.
     * @param ReportDetails     The details of the report.
     * @param Status            The status of the report.
     */
    public Reports(int ReportID, int IncidentID, String ReportingOfficer,
                   Date ReportDate, String ReportDetails, String Status) {
        this.ReportID = ReportID;
        this.IncidentID = IncidentID;
        this.ReportingOfficer = ReportingOfficer;
        this.ReportDate = ReportDate;
        this.ReportDetails = ReportDetails;
        this.Status = Status;
    }

    /**
     * Retrieves the unique identifier for the report.
     *
     * @return The unique identifier for the report.
     */
    public int getReportID() {
        return ReportID;
    }

    /**
     * Sets the unique identifier for the report.
     *
     * @param ReportID The unique identifier for the report to be set.
     */
    public void setReportID(int ReportID) {
        this.ReportID = ReportID;
    }

    /**
     * Retrieves the identifier for the incident associated with the report.
     *
     * @return The identifier for the incident associated with the report.
     */
    public int getIncidentID() {
        return IncidentID;
    }

    /**
     * Sets the identifier for the incident associated with the report.
     *
     * @param IncidentID The identifier for the incident associated with the report to be set.
     */
    public void setIncidentID(int IncidentID) {
        this.IncidentID = IncidentID;
    }

    /**
     * Retrieves the name of the officer who filed the report.
     *
     * @return The name of the officer who filed the report.
     */
    public String getReportingOfficer() {
        return ReportingOfficer;
    }

    /**
     * Sets the name of the officer who filed the report.
     *
     * @param ReportingOfficer The name of the officer who filed the report to be set.
     */
    public void setReportingOfficer(String ReportingOfficer) {
        this.ReportingOfficer = ReportingOfficer;
    }

    /**
     * Retrieves the date when the report was filed.
     *
     * @return The date when the report was filed.
     */
    public Date getReportDate() {
        return ReportDate;
    }

    /**
     * Sets the date when the report was filed.
     *
     * @param ReportDate The date when the report was filed to be set.
     */
    public void setReportDate(Date ReportDate) {
        this.ReportDate = ReportDate;
    }


    /**
     * Retrieves the details of the report.
     *
     * @return The details of the report.
     */
    public String getReportDetails() {
        return ReportDetails;
    }

    /**
     * Sets the details of the report.
     *
     * @param ReportDetails The details of the report to be set.
     */
    public void setReportDetails(String ReportDetails) {
        this.ReportDetails = ReportDetails;
    }

    /**
     * Retrieves the status of the report.
     *
     * @return The status of the report.
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the status of the report.
     *
     * @param Status The status of the report to be set.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Returns a string representation of the report object.
     *
     * @return A string representation of the report object.
     */
    @Override
    public String toString() {
        return "Reports{" +
                "ReportID=" + ReportID +
                ", IncidentID=" + IncidentID +
                ", ReportingOfficer=" + ReportingOfficer +
                ", ReportDate=" + ReportDate +
                ", ReportDetails='" + ReportDetails + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }

}
