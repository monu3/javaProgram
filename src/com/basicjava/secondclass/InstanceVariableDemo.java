package com.basicjava.secondclass;

public class InstanceVariableDemo {
	
	private String name ;
	private double salary;
	private int age;
	protected char gender;
	public String email;
	String phoneNo;
	
	
	public void display()
	{
		System.out.println("String :"+name);
		System.out.println("Age :"+age);
	}
	
	public static void main(String[] args) {
		
		InstanceVariableDemo obj = new InstanceVariableDemo();
		obj.display();
		
		
		
		System.out.println("Name :"+obj.name);
		System.out.println("Salary :"+obj.salary);
		System.out.println("Age :"+obj.age);
		System.out.println("Gender :"+obj.gender);
		System.out.println("email :"+obj.email);
		System.out.println("PHone Number :"+obj.phoneNo);
	}

}
