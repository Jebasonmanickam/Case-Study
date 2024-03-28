package com.hexaware.entity;

import java.util.Date;

public class Suspects {
 private int SuspectID;
 private String FirstName;
 private String LastName;
 private Date DateOfBirth;
 private String Gender;
 private String ContactInformation; 

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

 public void setSuspectID(int SuspectID) {
     this.SuspectID = SuspectID;
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

