package com.pranav.Main;

import java.util.Scanner;

import com.pranav.Employee.Emplyoee;
import com.pranav.service.ServiceCLass;

public class DriverClass {

	
	public static void main(String[] args) {

	
	
	ServiceCLass obj = new ServiceCLass();
	
	
	Emplyoee obj1 = new Emplyoee("Pranav" ,"Bhaskare");
	
	Scanner sc = new Scanner(System.in);
	
    String emailAddressGenerated = null;
    String generatedPassword = null;
	
	System.out.println("Please Enter The Department From The Following");
	System.out.println("Technical");
	System.out.println("Admin");
	System.out.println("Human Resource");
	System.out.println("Legal");
	
	int option = sc.nextInt();
	switch (option) {
	case 1: {
		        
		emailAddressGenerated	= obj.generateEmailAddress(obj1.getFirstName().toLowerCase(),obj1.getLastName(),"tech");
		generatedPassword  =  obj.generatePassword(8);
	    obj.showCredentials(emailAddressGenerated, generatedPassword);
	    break;
	    
	}
	
	case 2: {
		emailAddressGenerated	= obj.generateEmailAddress(obj1.getFirstName().toLowerCase(),obj1.getLastName(),"admin");
		generatedPassword  =  obj.generatePassword(8);
		obj.showCredentials(emailAddressGenerated, generatedPassword);
		break;
		
	}
	
    case 3: {
    	emailAddressGenerated	= obj.generateEmailAddress(obj1.getFirstName().toLowerCase(),obj1.getLastName(),"hr");
    	generatedPassword  =  obj.generatePassword(8);
    	obj.showCredentials(emailAddressGenerated, generatedPassword);
    	break;
	}
	
    
    case 4: {
		 
    	emailAddressGenerated	= obj.generateEmailAddress(obj1.getFirstName().toLowerCase(),obj1.getLastName(),"legal");
    	generatedPassword  =  obj.generatePassword(8);
    	obj.showCredentials(emailAddressGenerated, generatedPassword);
    	break;
	}
	
	
	
	default:{
		System.out.println("Enter the Valid Option");
		break;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
