package com.emailapp.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	public Employee ()
	{
		
	}
	public Employee (String firstName, String lastName) {
		
		this.firstName =  firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		//System.out.println("getEmail Pass::"+email);
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		//System.out.println("setEmail Pass::"+ this.email);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}