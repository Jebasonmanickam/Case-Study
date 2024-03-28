package com.hexaware.entity;
import java.util.Date;
import java.util.*;
/**
 * Represents an incident in the system.
 * 
 * <p>An instance of this class contains information about an incident, including its ID, type,
 * date, location (latitude and longitude), description, status, victim ID, and suspect ID.
 */
public class Incidents {
    public int IncidentID;
    public String IncidentType;
    private String IncidentDate;
    private double Latitude;
    private double Longitude;
    private String Description;
    private String Status;
    private int VictimID;
    private int SuspectID;
  //private int AgencyID;  //2

    /**
     * Constructs a new Incidents object with the specified attributes.
     * 
     * @param IncidentID   The ID of the incident.
     * @param IncidentType The type of the incident.
     * @param IncidentDate The date of the incident.
     * @param Latitude     The latitude of the incident location.
     * @param Longitude    The longitude of the incident location.
     * @param Description  The description of the incident.
     * @param Status       The status of the incident.
     * @param VictimID     The ID of the victim involved in the incident.
     * @param SuspectID    The ID of the suspect involved in the incident.
     */
    public Incidents(int IncidentID, String IncidentType, String IncidentDate,
                     double Latitude, double Longitude, String Description, String Status,
                     int VictimID, int SuspectID) {
        this.IncidentID = IncidentID;
        this.IncidentType = IncidentType;
        this.IncidentDate = IncidentDate;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Description = Description;
        this.Status = Status;
        this.VictimID = VictimID;
        this.SuspectID = SuspectID;
      //this.AgencyID=AgencyID;  //3
    }
    

    // Getter and setter methods for IncidentID, IncidentType, IncidentDate, Latitude,
    // Longitude, Description, Status, VictimID, and SuspectID attributes are provided below.
    /**
     * Retrieves the ID of the incident.
     * 
     * @return The ID of the incident.
     */
    public int getID() {
        return IncidentID;
    }

    /**
     * Sets the ID of the incident.
     * 
     * @param IncidentID The ID of the incident to be set.
     */
    public void setID(int IncidentID) {
        this.IncidentID = IncidentID;
    }

    /**
     * Retrieves the type of the incident.
     * 
     * @return The type of the incident.
     */
    public String getType() {
        return IncidentType;
    }

    /**
     * Sets the type of the incident.
     * 
     * @param IncidentType The type of the incident to be set.
     */
    public void setType(String IncidentType) {
        this.IncidentType = IncidentType;
    }

    /**
     * Retrieves the date of the incident.
     * 
     * @return The date of the incident.
     */
    public String getDate() {
        return IncidentDate;
    }

    /**
     * Sets the date of the incident.
     * 
     * @param IncidentDate The date of the incident to be set.
     */
    public void setDate(String IncidentDate) {
        this.IncidentDate = IncidentDate;
    }
    /**
     * Retrieves the latitude of the incident location.
     * 
     * @return The latitude of the incident location.
     */
    public double getLati() {
        return Latitude;
    }

    /**
     * Sets the latitude of the incident location.
     * 
     * @param Latitude The latitude of the incident location to be set.
     */
    public void setLati(double Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Retrieves the longitude of the incident location.
     * 
     * @return The longitude of the incident location.
     */
    public double getLongi() {
        return Longitude;
    }

    /**
     * Sets the longitude of the incident location.
     * 
     * @param Longitude The longitude of the incident location to be set.
     */
    public void setLongi(double Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Retrieves the description of the incident.
     * 
     * @return The description of the incident.
     */
    public String getDes() {
        return Description;
    }

    /**
     * Sets the description of the incident.
     * 
     * @param Description The description of the incident to be set.
     */
    public void setDes(String Description) {
        this.Description = Description;
    }

    /**
     * Retrieves the status of the incident.
     * 
     * @return The status of the incident.
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the status of the incident.
     * 
     * @param Status The status of the incident to be set.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Retrieves the ID of the victim involved in the incident.
     * 
     * @return The ID of the victim involved in the incident.
     */
    public int getVicID() {
        return VictimID;
    }

    /**
     * Sets the ID of the victim involved in the incident.
     * 
     * @param VictimID The ID of the victim involved in the incident to be set.
     */
    public void setVicID(int VictimID) {
        this.VictimID = VictimID;
    }

    /**
     * Retrieves the ID of the suspect involved in the incident.
     * 
     * @return The ID of the suspect involved in the incident.
     */
    public int getSuspID() {
        return SuspectID;
    }

    /**
     * Sets the ID of the suspect involved in the incident.
     * 
     * @param SuspectID The ID of the suspect involved in the incident to be set.
     */
    public void setSuspID(int SuspectID) {
        this.SuspectID = SuspectID;
    }
  //}
  	//public void setAgencyID(int AgencyID) {
  	//	this.AgencyID = AgencyID;
  	//}
    /**
     * Returns a string representation of the Incidents object.
     * 
     * @return A string representation of the Incidents object, including its ID, type, date, latitude, longitude,
     *         description, status, and victim ID.
     */
    @Override
    public String toString() {
        return "Incidents [Id=" + IncidentID + ", Type=" + IncidentType + ", Date=" + IncidentDate + 
               ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Description=" + Description +
               ", Status=" + Status + ", VictimID=" + VictimID + "]";
    }

}

