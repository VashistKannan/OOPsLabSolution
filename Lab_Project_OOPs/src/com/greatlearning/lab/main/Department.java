package com.greatlearning.lab.main;
import java.util.Scanner;

import com.greatlearning.lab.model.Employee;
import com.greatlearning.lab.service.CredentialService;
public class Department {
	static String firstName,lastName,dept;
	static String generatedMail;
	static char[] generatedPassword;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name and Last Name :");
		Employee employee = new Employee(sc.nextLine(),sc.nextLine()); // getting the name from the user
		//Employee employee = new Employee("Vashist","Kannan");			Hard coded username
		CredentialService cs = new CredentialService();
		firstName= employee.getFirstName();
		
		int option;
		
			System.out.println("\nPlease enter the department from the following\n");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			option = sc.nextInt();
			
			switch(option) {
			
			case 1:
				//Technical
				generatedMail = cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(), "tech");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(firstName, generatedMail,generatedPassword);
				break;
				
			case 2:
				//Admin
				generatedMail =cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(), "adm");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(firstName, generatedMail,generatedPassword);
				break;
				
			case 3:
				//Human Resource				
				generatedMail = cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(), "hr");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(firstName, generatedMail,generatedPassword);
				break;
				
			case 4:
				//Legal
				cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(), dept = "leg");
				cs.generatePassword();
				cs.showCredentials(firstName, generatedMail,generatedPassword);
				break;
				
			default:
				System.out.println("Please Enter valid option");
			}
			sc.close();
		} 

	}


