package com.hexaware.entity;


public class Officers {
 private int OfficerID; 
 private String FirstName;
 private String LastName;
 private String BadgeNumber;
 private String Rank;
 private String ContactInformation;
 private int AgencyID; 

 public Officers(int OfficerID, String FirstName, String LastName, String BadgeNumber,
                 String Rank, String ContactInformation, int AgencyID) {
     this.OfficerID = OfficerID;
     this.FirstName = FirstName;
     this.LastName = LastName;
     this.BadgeNumber = BadgeNumber;
     this.Rank = Rank;
     this.ContactInformation = ContactInformation;
     this.AgencyID = AgencyID;
 }

 public int getOfficerID() {
     return OfficerID;
 }

 public void setOfficerID(int OfficerID) {
     this.OfficerID = OfficerID;
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

 public String getBadgeNumber() {
     return BadgeNumber;
 }

 public void setBadgeNumber(String BadgeNumber) {
     this.BadgeNumber = BadgeNumber;
 }

 public String getRank() {
     return Rank;
 }

 public void setRank(String Rank) {
     this.Rank = Rank;
 }

 public String getContactInformation() {
     return ContactInformation;
 }

 public void setContactInformation(String ContactInformation) {
     this.ContactInformation = ContactInformation;
 }

 public int getAgencyID() {
     return AgencyID;
 }

 public void setAgencyID(int AgencyID) {
     this.AgencyID = AgencyID;
 }

 @Override
 public String toString() {
     return "Officers{" +
             "OfficerID=" + OfficerID +
             ", FirstName='" + FirstName + '\'' +
             ", LastName='" + LastName + '\'' +
             ", BadgeNumber='" + BadgeNumber + '\'' +
             ", Rank='" + Rank + '\'' +
             ", ContactInformation='" + ContactInformation + '\'' +
             ", AgencyID=" + AgencyID +
             '}';
 }
}
