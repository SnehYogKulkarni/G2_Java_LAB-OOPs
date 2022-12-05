package com.emailapp.services;

import com.emailapp.interfaces.ICredentials;
import com.emailapp.model.Employee;

public class CredentialServices implements ICredentials{
	private String companyNameSuffix = "greatlearning.com";
	
	Employee employee = new Employee();
	public String generatePassword() {
		int length = 8;
		String passwordSet= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_<>.";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return (String.valueOf(password));
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		String generateEmail = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department+"."+companyNameSuffix;
		return generateEmail;
	}	
	public void showCredentials(Employee employee) {
		   System.out.println(" \n Dear " + employee.getFirstName() + " your generated credentials are as follows ::");
		   	     
		   System.out.println(" Email ----- > "+ employee.getEmail());
		   System.out.println(" Password ---> "+ employee.getPassword());
		}
		
}



