package com.swagata.main;
import com.swagata.model.Employee;
import com.swagata.service.CredentialService;
import java.util.*;

public class Driver {
	public static void main(String args[])
	{
		Employee employee=new Employee("Swagata","Mukherjee");
		CredentialService cs=new CredentialService();
		Scanner sc=new Scanner(System.in);
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("Please enter your Department:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4 Legal");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			//technical
			generatedEmail=cs.generateEmailAddress(employee.getfName().toLowerCase(),
					employee.getlName().toLowerCase(),"tech");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee,generatedEmail,generatedPassword);
			break;
		case 2:
			//admin
			generatedEmail=cs.generateEmailAddress(employee.getfName().toLowerCase(),
					employee.getlName().toLowerCase(),"admin");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee,generatedEmail,generatedPassword);
			break;
		case 3:
			//Human Resource
			generatedEmail=cs.generateEmailAddress(employee.getfName().toLowerCase(),
					employee.getlName().toLowerCase(),"HR");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee,generatedEmail,generatedPassword);
			break;
		case 4:
			//legal
			generatedEmail=cs.generateEmailAddress(employee.getfName().toLowerCase(),
					employee.getlName().toLowerCase(),"legal");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee,generatedEmail,generatedPassword);
			break;
		default:
			System.out.println("Wrong choice");
		}
		
	}

}
