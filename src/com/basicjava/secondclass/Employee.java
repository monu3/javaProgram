package com.basicjava.secondclass;

public class Employee {
public void employInfo(String firstName, String middleName, String lastName , int age, double salary) {
	
	System.out.println("EmployFirstName :"+firstName);
	System.out.println("EmployMiddleName :"+middleName);
	System.out.println("EmployLastName :"+lastName);
	System.out.println("Employ Age :"+age);
	System.out.println("Employ Salary :"+salary);
	
		
	}

public static void main(String[] args) {
	
	String firstName = "monu";
	String middleName = "xaina";
	String lastName = "Siddiki";
	int age = 20;
	double salary = 500000;
	
	Employee information = new Employee();
	information.employInfo(firstName,middleName,lastName,age,salary);
	
	
	

}

}
	