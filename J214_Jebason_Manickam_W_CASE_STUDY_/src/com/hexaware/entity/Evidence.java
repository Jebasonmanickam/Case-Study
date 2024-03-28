package com.hexaware.entity;

/**
 * Represents evidence related to an incident.
 * 
 * <p>An instance of this class contains information about the evidence, including its ID, description,
 * location where it was found, and the ID of the incident it is associated with.
 */
public class Evidence {
    private int EvidenceID;
    private String Description;
    private String LocationFound;
    private int IncidentID;

    /**
     * Constructs a new Evidence object with the specified attributes.
     * 
     * @param EvidenceID The ID of the evidence.
     * @param Description The description of the evidence.
     * @param LocationFound The location where the evidence was found.
     * @param IncidentID The ID of the incident associated with the evidence.
     */
    public Evidence(int EvidenceID, String Description, String LocationFound, int IncidentID) {
        this.EvidenceID = EvidenceID;
        this.Description = Description;
        this.LocationFound = LocationFound;
        this.IncidentID = IncidentID;
    }

    /**
     * Retrieves the ID of the evidence.
     * 
     * @return The evidence ID.
     */
    public int getEvidenceID() {
        return EvidenceID;
    }

    /**
     * Sets the ID of the evidence.
     * 
     * @param EvidenceID The evidence ID to set.
     */
    public void setEvidenceID(int EvidenceID) {
        this.EvidenceID = EvidenceID;
    }

    /**
     * Retrieves the description of the evidence.
     * 
     * @return The evidence description.
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the description of the evidence.
     * 
     * @param Description The evidence description to set.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Retrieves the location where the evidence was found.
     * 
     * @return The location where the evidence was found.
     */
    public String getLocationFound() {
        return LocationFound;
    }

    /**
     * Sets the location where the evidence was found.
     * 
     * @param LocationFound The location where the evidence was found to set.
     */
    public void setLocationFound(String LocationFound) {
        this.LocationFound = LocationFound;
    }

    /**
     * Retrieves the ID of the incident associated with the evidence.
     * 
     * @return The ID of the associated incident.
     */
    public int getIncidentID() {
        return IncidentID;
    }

    /**
     * Sets the ID of the incident associated with the evidence.
     * 
     * @param IncidentID The ID of the associated incident to set.
     */
    public void setIncidentID(int IncidentID) {
        this.IncidentID = IncidentID;
    }

    /**
     * Returns a string representation of the Evidence object.
     * 
     * @return A string representation of the Evidence object.
     */
    @Override
    public String toString() {
        return "Evidence{" +
                "EvidenceID=" + EvidenceID +
                ", Description='" + Description + '\'' +
                ", LocationFound='" + LocationFound + '\'' +
                ", IncidentID=" + IncidentID +
                '}';
    }
}
