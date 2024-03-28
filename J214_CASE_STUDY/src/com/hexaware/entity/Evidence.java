package com.hexaware.entity;

public class Evidence {
 private int EvidenceID; 
 private String Description;
 private String LocationFound;
 private int IncidentID; 

 public Evidence(int EvidenceID, String Description, String LocationFound, int IncidentID) {
     this.EvidenceID = EvidenceID;
     this.Description = Description;
     this.LocationFound = LocationFound;
     this.IncidentID = IncidentID;
 }

 public int getEvidenceID() {
     return EvidenceID;
 }

 public void setEvidenceID(int EvidenceID) {
     this.EvidenceID = EvidenceID;
 }

 public String getDescription() {
     return Description;
 }

 public void setDescription(String Description) {
     this.Description = Description;
 }

 public String getLocationFound() {
     return LocationFound;
 }

 public void setLocationFound(String LocationFound) {
     this.LocationFound = LocationFound;
 }

 public int getIncidentID() {
     return IncidentID;
 }

 public void setIncidentID(int IncidentID) {
     this.IncidentID = IncidentID;
 }

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
