package com.hexaware.entity;

import java.util.Date;

public class Reports {
 private int ReportID; 
 private int IncidentID; 
 private String ReportingOfficer; 
 private Date ReportDate;
 private String ReportDetails;
 private String Status; 

 public Reports(int ReportID, int IncidentID, String ReportingOfficer, Date ReportDate,
                String ReportDetails, String Status) {
     this.ReportID = ReportID;
     this.IncidentID = IncidentID;
     this.ReportingOfficer = ReportingOfficer;
     this.ReportDate = ReportDate;
     this.ReportDetails = ReportDetails;
     this.Status = Status;
 }

 public int getReportID() {
     return ReportID;
 }

 public void setReportID(int ReportID) {
     this.ReportID = ReportID;
 }

 public int getIncidentID() {
     return IncidentID;
 }

 public void setIncidentID(int IncidentID) {
     this.IncidentID = IncidentID;
 }

 public String getReportingOfficer() {
     return ReportingOfficer;
 }

 public void setReportingOfficer(String ReportingOfficer) {
     this.ReportingOfficer = ReportingOfficer;
 }

 public Date getReportDate() {
     return ReportDate;
 }

 public void setReportDate(Date ReportDate) {
     this.ReportDate = ReportDate;
 }

 public String getReportDetails() {
     return ReportDetails;
 }

 public void setReportDetails(String ReportDetails) {
     this.ReportDetails = ReportDetails;
 }

 public String getStatus() {
     return Status;
 }

 public void setStatus(String Status) {
     this.Status = Status;
 }

 @Override
 public String toString() {
     return "Reports{" +
             "ReportID=" + ReportID +
             ", IncidentID=" + IncidentID +
             ", ReportingOfficer=" + ReportingOfficer +
             ", ReportDate=" + ReportDate +
             ", ReportDetails='" + ReportDetails + '\'' +
             ", Status='" + Status + '\'' +
             '}';
 }
}
