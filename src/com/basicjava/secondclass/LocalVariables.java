package com.basicjava.secondclass;

public class LocalVariables {
	
	public void displayCollegeInfo( String collegeName, int number) {
		
		String hodName = "Ram Pandy";
		System.out.println("Hod Name :"+hodName);
		System.out.println("College Name :"+collegeName);
		System.out.println("number :"+number);
	}
	
	public static void main(String[] args) {
		
		String collegeName = "Texas international College";
		int number = 1234;
		
		//object or instance in java
		LocalVariables localVariabledemo = new LocalVariables();
		
		//calling methods having arguments
		localVariabledemo.displayCollegeInfo(collegeName, number);
		
		
		System.out.println("College Name :" +collegeName);
	}

}
