package com.hexaware.entity;

import java.util.Date;
/**
 * Represents a victim involved in an incident.
 */
public class Victims {
    private int VictimID; // Unique identifier for the victim
    private String FirstName; // First name of the victim
    private String LastName; // Last name of the victim
    private Date DateOfBirth; // Date of birth of the victim
    private String Gender; // Gender of the victim
    private String ContactInformation; // Contact information of the victim

    /**
     * Constructs a Victim object with the specified attributes.
     *
     * @param VictimID           The unique identifier for the victim.
     * @param FirstName          The first name of the victim.
     * @param LastName           The last name of the victim.
     * @param DateOfBirth        The date of birth of the victim.
     * @param Gender             The gender of the victim.
     * @param ContactInformation The contact information of the victim.
     */
    public Victims(int VictimID, String FirstName, String LastName, Date DateOfBirth,
                   String Gender, String ContactInformation) {
        this.VictimID = VictimID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.ContactInformation = ContactInformation;
    }

    /**
     * Retrieves the unique identifier for the victim.
     *
     * @return The unique identifier for the victim.
     */
    public int getVictimID() {
        return VictimID;
    }

    /**
     * Sets the unique identifier for the victim.
     *
     * @param VictimID The unique identifier for the victim.
     */
    public void setVictimID(int VictimID) {
        this.VictimID = VictimID;
    }

    /**
     * Retrieves the first name of the victim.
     *
     * @return The first name of the victim.
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Sets the first name of the victim.
     *
     * @param FirstName The first name of the victim.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Retrieves the last name of the victim.
     *
     * @return The last name of the victim.
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Sets the last name of the victim.
     *
     * @param LastName The last name of the victim.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Retrieves the date of birth of the victim.
     *
     * @return The date of birth of the victim.
     */
    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * Sets the date of birth of the victim.
     *
     * @param DateOfBirth The date of birth of the victim.
     */
    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Retrieves the gender of the victim.
     *
     * @return The gender of the victim.
     */
    public String getGender() {
        return Gender;
    }

    /**
     * Sets the gender of the victim.
     *
     * @param Gender The gender of the victim.
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Retrieves the contact information of the victim.
     *
     * @return The contact information of the victim.
     */
    public String getContactInformation() {
        return ContactInformation;
    }

    /**
     * Sets the contact information of the victim.
     *
     * @param ContactInformation The contact information of the victim.
     */
    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }

    /**
     * Returns a string representation of the Victims object.
     *
     * @return A string representation of the Victims object.
     */
    @Override
    public String toString() {
        return "Victim{" +
                "VictimID=" + VictimID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", Gender='" + Gender + '\'' +
                ", ContactInformation='" + ContactInformation + '\'' +
                '}';
    }
}
