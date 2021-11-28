package com.greatlearning.lab.service;

import java.util.Random;



public class CredentialService {
	String email;
	String range = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*";

	
	public char[] generatePassword() {
		Random random = new Random();
		char[] password = new char[8];
		for(int i=0;i<8;i++) {
			password[i]=range.charAt(random.nextInt(range.length()));		
		}
		return password;
	}
	
	public String generateEmailAddress(String firstname, String lastname, String dept) {
		 email = firstname.toLowerCase()+lastname.toLowerCase()+"@"+ dept +".sed.com";
		return email;
	}
	
	public void showCredentials(String firstName, String email, char[] generatedpassword) {
		System.out.println("Dear "+ firstName +" your generated credentials are as follows"  );
		System.out.println("Email   ------> "+email);
		System.out.print("Password  ----> " + String.copyValueOf(generatedpassword));
		//System.out.println(generatedpassword);
		
	}
}
