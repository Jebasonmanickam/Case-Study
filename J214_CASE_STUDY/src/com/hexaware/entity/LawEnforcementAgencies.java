package com.hexaware.entity;

import java.util.List;

public class LawEnforcementAgencies {
 private int AgencyID; 
 private String AgencyName;
 private String Jurisdiction;
 private String ContactInformation;
 private List<Officers> Officers; 

 public LawEnforcementAgencies(int AgencyID, String AgencyName, String Jurisdiction,
                               String ContactInformation, List<Officers> Officers) {
     this.AgencyID = AgencyID;
     this.AgencyName = AgencyName;
     this.Jurisdiction = Jurisdiction;
     this.ContactInformation = ContactInformation;
     this.Officers = Officers;
 }

 public int getAgencyID() {
     return AgencyID;
 }

 public void setAgencyID(int AgencyID) {
     this.AgencyID = AgencyID;
 }

 public String getAgencyName() {
     return AgencyName;
 }

 public void setAgencyName(String AgencyName) {
     this.AgencyName = AgencyName;
 }

 public String getJurisdiction() {
     return Jurisdiction;
 }

 public void setJurisdiction(String Jurisdiction) {
     this.Jurisdiction = Jurisdiction;
 }

 public String getContactInformation() {
     return ContactInformation;
 }

 public void setContactInformation(String ContactInformation) {
     this.ContactInformation = ContactInformation;
 }

 public List<Officers> getOfficers() {
     return Officers;
 }

 public void setOfficers(List<Officers> Officers) {
     this.Officers = Officers;
 }

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
