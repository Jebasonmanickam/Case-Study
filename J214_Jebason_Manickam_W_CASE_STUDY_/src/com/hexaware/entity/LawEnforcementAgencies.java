package com.hexaware.entity;

import java.util.List;

public class LawEnforcementAgencies {
    private int AgencyID; // The ID of the agency
    private String AgencyName; // The name of the agency
    private String Jurisdiction; // The jurisdiction area of the agency
    private String ContactInformation; // The contact information of the agency
    private List<Officers> Officers; // The list of officers working in the agency

    /**
     * Constructs a law enforcement agency with the specified attributes.
     * 
     * @param AgencyID          The ID of the agency.
     * @param AgencyName        The name of the agency.
     * @param Jurisdiction      The jurisdiction area of the agency.
     * @param ContactInformation The contact information of the agency.
     * @param Officers          The list of officers working in the agency.
     */ 

    public LawEnforcementAgencies(int AgencyID, String AgencyName, String Jurisdiction,
            String ContactInformation, List<Officers> Officers) {
        this.AgencyID = AgencyID;
        this.AgencyName = AgencyName;
        this.Jurisdiction = Jurisdiction;
        this.ContactInformation = ContactInformation;
        this.Officers = Officers;
    }

    /**
     * Retrieves the ID of the law enforcement agency.
     * 
     * @return The ID of the law enforcement agency.
     */
    public int getAgencyID() {
        return AgencyID;
    }

    /**
     * Sets the ID of the law enforcement agency.
     * 
     * @param AgencyID The ID of the law enforcement agency to be set.
     */
    public void setAgencyID(int AgencyID) {
        this.AgencyID = AgencyID;
    }


    /**
     * Retrieves the name of the law enforcement agency.
     * 
     * @return The name of the law enforcement agency.
     */
    public String getAgencyName() {
        return AgencyName;
    }

    /**
     * Sets the name of the law enforcement agency.
     * 
     * @param AgencyName The name of the law enforcement agency to be set.
     */
    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }


    /**
     * Retrieves the jurisdiction area of the law enforcement agency.
     * 
     * @return The jurisdiction area of the law enforcement agency.
     */
    public String getJurisdiction() {
        return Jurisdiction;
    }

    /**
     * Sets the jurisdiction area of the law enforcement agency.
     * 
     * @param Jurisdiction The jurisdiction area of the law enforcement agency to be set.
     */
    public void setJurisdiction(String Jurisdiction) {
        this.Jurisdiction = Jurisdiction;
    }

    /**
     * Retrieves the contact information of the law enforcement agency.
     * 
     * @return The contact information of the law enforcement agency.
     */
    public String getContactInformation() {
        return ContactInformation;
    }

    /**
     * Sets the contact information of the law enforcement agency.
     * 
     * @param ContactInformation The contact information of the law enforcement agency to be set.
     */
    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }


    /**
     * Retrieves the list of officers working in the law enforcement agency.
     * 
     * @return The list of officers working in the law enforcement agency.
     */
    public List<Officers> getOfficers() {
        return Officers;
    }

    /**
     * Sets the list of officers working in the law enforcement agency.
     * 
     * @param Officers The list of officers working in the law enforcement agency to be set.
     */
    public void setOfficers(List<Officers> Officers) {
        this.Officers = Officers;
    }


    /**
     * Returns a string representation of the law enforcement agency, including its ID, name, jurisdiction, contact information,
     * and the list of officers.
     * 
     * @return A string representation of the law enforcement agency.
     */
    @Override
    public String toString() {
        return "LawEnforcementAgencies{" +
                "AgencyID=" + AgencyID +
                ", AgencyName='" + AgencyName + '\'' +
                ", Jurisdiction='" + Jurisdiction + '\'' +
                ", ContactInformation='" + ContactInformation + '\'' +
                ", Officers=" + Officers +
                '}';
    }

}
