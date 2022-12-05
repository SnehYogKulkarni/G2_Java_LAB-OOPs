
package com.emailapp.main;
import com.emailapp.interfaces.ICredentials;
import com.emailapp.model.Employee;
import com.emailapp.services.CredentialServices;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n Enetr Your First Name :: ");
		String firstNameEmployee = sc.nextLine();
		System.out.print("\n Enetr Your Last Name :: ");
		String lastNameEmployee = sc.nextLine();
		
		Employee employee = new Employee(firstNameEmployee, lastNameEmployee);
		
		ICredentials cs = new CredentialServices();
		
		String generateEmail= null; 
		String generatePassword = null;
		
		System.out.println("\n Please enter your department from following :: ");
		System.out.println("\n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		
		System.out.print("\n Enetr Your Department (1/2/3/4) :: ");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: generateEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"tech");
				generatePassword = cs.generatePassword();
				break;
		case 2: generateEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"admin");
				generatePassword = cs.generatePassword();
				break;
		case 3: generateEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"hr");
				generatePassword = cs.generatePassword();
				break;
		case 4: generateEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"legal");
				generatePassword = cs.generatePassword();
				break;
		default: System.out.println("Wrong Choice..... Exited");
		         break;
		}
		
		
		employee.setEmail(generateEmail);
		employee.setPassword(generatePassword);
		cs.showCredentials(employee);
		
		
	}

}
