create database crime;
use crime;

Create table Victims 
(VictimID INT Primary key,
FirstName Varchar(30),
LastName Varchar(30),
DateOfBirth Date,
Gender Varchar(20),
Address Varchar (50),
PhoneNumber Varchar(20));

ALTER TABLE Victims
DROP FOREIGN KEY AgencyID;
ALTER TABLE Victims
DROP COLUMN AgencyID;

    
Create table Suspects 
(SuspectID INT Primary key,
FirstName Varchar(30),
LastName Varchar(30),
DateOfBirth Date,
Gender Varchar(20),
Address Varchar (50),
PhoneNumber Varchar(20));

Create table Incidents
(IncidentID INT Primary key,
IncidentType Varchar(20),
IncidentDate Date,
Latitude DECIMAL(12,9) NOT NULL,
Longitude DECIMAL(12,9) NOT NULL,
Description VARCHAR(255),
Status Varchar(20),
VictimID INT,
SuspectID INT,
FOREIGN KEY (VictimID) REFERENCES Victims(VictimID), 
FOREIGN KEY (SuspectID) REFERENCES Suspects(SuspectID)
);
ALTER TABLE Incidents
ADD AgencyID INT,
ADD CONSTRAINT AgencyID
    FOREIGN KEY (AgencyID)
    REFERENCES LawEnforcementAgencies(AgencyID);
    
Create table Evidence
(EvidenceID INT PRIMARY KEY,
Description Varchar(255),
LocationFoundLatitude DECIMAL(12,9) NOT NULL,
LocationFoundLongitude DECIMAL(12,9) NOT NULL,
IncidentID INT,
FOREIGN KEY (IncidentID) REFERENCES Incidents(IncidentID)
);

Create Table LawEnforcementAgencies
(AgencyID INT Primary Key,
AgencyName Varchar(20),
Jurisdiction VARCHAR(100),
Address Varchar(50),
PhoneNumber Varchar(20)
);

Create table Officers
(OfficerID INT Primary Key,
FirstName Varchar(20),
LastName Varchar(20),
BadgeNumber INT,
RankNumber INT,
Address Varchar(50),
PhoneNumber Varchar(20),
AgencyID INT,
Foreign Key (AgencyID) REFERENCES LawEnforcementAgencies(AgencyID)
);

Create table Reports
(ReportID INT PRIMARY KEY,
IncidentID INT,
ReportingOfficer INT,
ReportDate Date,
ReportDetails TEXT,
Status Varchar(20),
Foreign Key (IncidentID) REFERENCES Incidents(IncidentID),
Foreign Key (ReportingOfficer) REFERENCES Officers(OfficerID)
);

ALTER TABLE Reports
MODIFY COLUMN ReportingOfficer VARCHAR(50);

Select * from Victims;
Select * from Suspects;
Select * from Incidents;
Drop table Evidence;
Drop table LawEnforcementAgencies;
Drop table Reports;
Drop table Officers;


INSERT INTO Incidents (IncidentID, IncidentType, IncidentDate, Latitude, Longitude, Description, Status, VictimID, SuspectID, AgencyID)
VALUES 
    (1, 'Robbery', '2024-03-27', 40.7128, -74.0060, 'A robbery occurred at the bank.', 'Investigating', 1, 1, 1),
    (2, 'Assault', '2024-04-15', 34.0522, -118.2437, 'An assault incident near downtown.', 'Open', 2, 2, 2),
    (3, 'Burglary', '2024-05-02', 51.5074, -0.1278, 'A burglary reported at a residence.', 'Closed', 3, NULL, 1); -- Assuming no suspect identified


INSERT INTO Victims (VictimID, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber)
VALUES (1, 'John', 'Doe', '1990-05-15', 'Male', '123 Main St', '555-1234');

INSERT INTO Victims (VictimID, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber)
VALUES (2, 'Jane', 'Smith', '1985-09-20', 'Female', '456 Elm St', '555-5678');
INSERT INTO Victims (VictimID, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber)
VALUES (3, 'John', 'Steve', '1985-10-20', 'Male', 'Clarke st', '777-5678');

INSERT INTO Suspects (SuspectID, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber)
VALUES (1, 'John', 'Doe', '1990-05-15', 'Male', '123 Main St', '555-1234');
INSERT INTO Suspects (SuspectID, FirstName, LastName, DateOfBirth, Gender, Address, PhoneNumber)
VALUES (2, 'John', 'Steve', '1985-10-20', 'Male', 'Clarke st', '777-5678');