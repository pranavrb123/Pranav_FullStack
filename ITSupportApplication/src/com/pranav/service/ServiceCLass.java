package com.pranav.service;

import java.security.SecureRandom;

import com.pranav.Employee.Emplyoee;
import com.pranav.ITsupportApp.Department;
import com.pranav.Main.DriverClass;


public class ServiceCLass extends DriverClass implements Department 
{

	DriverClass driverClass = new DriverClass();
	
	Emplyoee obj1 = new Emplyoee("Pranav" ,"Bhaskare");

	@Override
	public String generatePassword(int len) {
	
		
		 String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		 SecureRandom random = new SecureRandom();
	     StringBuilder sb = new StringBuilder();
		
	     for (int i = 0; i < len; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }
	 
	        String Password= sb.toString();
		
		    return Password;
	}


	
	@Override
	public void showCredentials(String emailId, String password) {
	
		System.out.println("Dear "+obj1.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --->" + emailId);
		System.out.println("Password --->" + password);
	
		
	}


	@Override
	public String generateEmailAddress(String firstName, String LastName, String department) {
		
		String email = firstName+LastName+"@"+department+".xyz"+".com";
		return email;
	}











	




	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
