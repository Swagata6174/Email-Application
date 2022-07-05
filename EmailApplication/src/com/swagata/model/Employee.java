package com.swagata.model;

public class Employee {
	
	//firstName
	//lastName
	
	private  String fName;
	private String lName;
	
	
	public Employee(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	
	

}
