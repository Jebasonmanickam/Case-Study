package com.hexaware.entity;

import java.util.Date;


public class Suspects {
    private int SuspectID;
    private String FirstName;
    private String LastName;
    private Date DateOfBirth;
    private String Gender;
    private String ContactInformation;

    /**
     * Constructs a Suspects object with the specified attributes.
     *
     * @param SuspectID          The unique identifier for the suspect.
     * @param FirstName          The first name of the suspect.
     * @param LastName           The last name of the suspect.
     * @param DateOfBirth        The date of birth of the suspect.
     * @param Gender             The gender of the suspect.
     * @param ContactInformation The contact information of the suspect.
     */
    public Suspects(int SuspectID, String FirstName, String LastName, Date DateOfBirth,
                    String Gender, String ContactInformation) {
        this.SuspectID = SuspectID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.ContactInformation = ContactInformation;
    }


    public int getSuspectID() {
        return SuspectID;
    }

    /**
     * Sets the unique identifier for the suspect.
     *
     * @param SuspectID The unique identifier for the suspect.
     */
    public void setSuspectID(int SuspectID) {
        this.SuspectID = SuspectID;
    }

    /**
     * Retrieves the first name of the suspect.
     *
     * @return The first name of the suspect.
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Sets the first name of the suspect.
     *
     * @param FirstName The first name of the suspect.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Retrieves the last name of the suspect.
     *
     * @return The last name of the suspect.
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Sets the last name of the suspect.
     *
     * @param LastName The last name of the suspect.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }


    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * Sets the date of birth of the suspect.
     *
     * @param DateOfBirth The date of birth of the suspect.
     */
    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Retrieves the gender of the suspect.
     *
     * @return The gender of the suspect.
     */
    public String getGender() {
        return Gender;
    }

    /**
     * Sets the gender of the suspect.
     *
     * @param Gender The gender of the suspect.
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Retrieves the contact information of the suspect.
     *
     * @return The contact information of the suspect.
     */
    public String getContactInformation() {
        return ContactInformation;
    }

    /**
     * Sets the contact information of the suspect.
     *
     * @param ContactInformation The contact information of the suspect.
     */
    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }

    @Override
    public String toString() {
        return "Suspect{" +
                "SuspectID=" + SuspectID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", Gender='" + Gender + '\'' +
                ", ContactInformation='" + ContactInformation + '\'' +
                '}';
    }
}
