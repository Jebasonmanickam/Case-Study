package com.hexaware.entity;

import java.util.Date;

public class Victims {
    private int VictimID; 
    private String FirstName;
    private String LastName;
    private Date DateOfBirth;
    private String Gender;
    private String ContactInformation; 

    
    public Victims(int VictimID, String FirstName, String LastName, Date DateOfBirth,
                  String Gender, String ContactInformation) {
        this.VictimID = VictimID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.ContactInformation = ContactInformation;
    }

    public int getVictimID() {
        return VictimID;
    }

    public void setVictimID(int VictimID) {
        this.VictimID = VictimID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getContactInformation() {
        return ContactInformation;
    }

    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }

    @Override
    public String toString() {
        return "Victim{" +
                "victimID=" + VictimID +
                ", firstName='" + FirstName + '\'' +
                ", lastName='" + LastName + '\'' +
                ", dateOfBirth=" + DateOfBirth +
                ", gender='" + Gender + '\'' +
                ", contactInformation='" + ContactInformation + '\'' +
                '}';
    }
}