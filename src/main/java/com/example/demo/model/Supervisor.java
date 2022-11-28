package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;

@Entity
public class Supervisor {
	

	String jurisdiction;

	String firstName;
	
	String lastName;
	
    public Supervisor()
    {
    	super();
    }
    
    public Supervisor(String jurisdiction, String firstName, String lastName)
    {
    	super();
    	this.jurisdiction = jurisdiction;
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    
	@JsonProperty("jurisdiction")
    public String getJurisdiction()
    {
        return jurisdiction;
    }
    
	@JsonProperty("firstName")
    public String getFirstName()
    {
        return firstName;
    }
    
	@JsonProperty("lastName")
    public String getLastName()
    {
        return lastName;
    }
    
	@JsonProperty("jurisdiction")
    public void setJurisdiction(String jurisdiction)
    {
        this.jurisdiction = jurisdiction;
    }
    
	@JsonProperty("firstName")
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
	@JsonProperty("lastName")
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    



}
