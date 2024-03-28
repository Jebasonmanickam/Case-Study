package com.hexaware.entity;


/**
 * The Officers class represents a law enforcement officer.
 */
public class Officers {
    private int OfficerID;
    private String FirstName;
    private String LastName;
    private String BadgeNumber;
    private String Rank;
    private String ContactInformation;
    private int AgencyID;

    /**
     * Constructs a new Officers object with the specified attributes.
     * @param OfficerID The ID of the officer.
     * @param FirstName The first name of the officer.
     * @param LastName The last name of the officer.
     * @param BadgeNumber The badge number of the officer.
     * @param Rank The rank of the officer.
     * @param ContactInformation The contact information of the officer.
     * @param AgencyID The ID of the agency to which the officer belongs.
     */
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

    /**
     * Retrieves the ID of the officer.
     * 
     * @return The ID of the officer.
     */
    public int getOfficerID() {
        return OfficerID;
    }

    /**
     * Sets the ID of the officer.
     * 
     * @param OfficerID The ID of the officer to be set.
     */
    public void setOfficerID(int OfficerID) {
        this.OfficerID = OfficerID;
    }

    /**
     * Retrieves the first name of the officer.
     * 
     * @return The first name of the officer.
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Sets the first name of the officer.
     * 
     * @param FirstName The first name of the officer to be set.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Retrieves the last name of the officer.
     * 
     * @return The last name of the officer.
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Sets the last name of the officer.
     * 
     * @param LastName The last name of the officer to be set.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Retrieves the badge number of the officer.
     * 
     * @return The badge number of the officer.
     */
    public String getBadgeNumber() {
        return BadgeNumber;
    }

    /**
     * Sets the badge number of the officer.
     * 
     * @param BadgeNumber The badge number of the officer to be set.
     */
    public void setBadgeNumber(String BadgeNumber) {
        this.BadgeNumber = BadgeNumber;
    }

    /**
     * Retrieves the rank of the officer.
     * 
     * @return The rank of the officer.
     */
    public String getRank() {
        return Rank;
    }

    /**
     * Sets the rank of the officer.
     * 
     * @param Rank The rank of the officer to be set.
     */
    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    /**
     * Retrieves the contact information of the officer.
     * 
     * @return The contact information of the officer.
     */
    public String getContactInformation() {
        return ContactInformation;
    }

    /**
     * Sets the contact information of the officer.
     * 
     * @param ContactInformation The contact information of the officer to be set.
     */
    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }


    /**
     * Retrieves the ID of the agency to which the officer belongs.
     * 
     * @return The ID of the agency.
     */
    public int getAgencyID() {
        return AgencyID;
    }

    /**
     * Sets the ID of the agency to which the officer belongs.
     * 
     * @param AgencyID The ID of the agency to be set.
     */
    public void setAgencyID(int AgencyID) {
        this.AgencyID = AgencyID;
    }

    /**
     * Returns a string representation of the Officers object.
     * 
     * @return A string representation of the Officers object.
     */
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
