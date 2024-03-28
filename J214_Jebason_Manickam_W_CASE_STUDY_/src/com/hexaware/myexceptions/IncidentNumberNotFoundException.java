package com.hexaware.myexceptions;

/**
 * Custom exception class for representing the scenario when an incident number is not found.
 * 
 * <p>This exception is thrown when an attempt is made to search for an incident using an invalid or non-existent incident number.
 */
public class IncidentNumberNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
    private String message;

    /**
     * Constructs a new IncidentNumberNotFoundException with the specified error message.
     * 
     * @param message The detail message of the exception.
     */
    public IncidentNumberNotFoundException(String message) {
        this.message = message;
    }

    /**
     * Retrieves the detail message of this exception.
     * 
     * @return The detail message string.
     */
    public String getMessage() {
        return message;
    }
}
