package com.basicjava.thirdclass;

public class staticVariabledemo {
	
	private static String collegeName;
	private static int rollNo;
	private static double amount;
	private static boolean gender;
	public static int phoneNo;
	static int age;
	
	public static void showdata() {
		System.out.println("College name :"+collegeName);
		System.out.println("roll No :"+rollNo);
		System.out.println("Amount :"+amount);
		System.out.println("gender :"+gender);
		System.out.println("age :"+age);
	}
	
	
	
	public static void main(String[] args) {
		

		 collegeName ="Texas college";
		 rollNo = 25;
		 amount = 5000;
		 gender = true;
		 phoneNo = 98765432;
		 age = 20;
		
		staticVariabledemo.showdata();
		
//		System.out.println("Default value for String :"+staticVariabledemo.collegeName);
//		System.out.println("Default value for int : "+staticVariabledemo.rollNo);
//		System.out.println("Default value for String :"+staticVariabledemo.phoneNo);
//		System.out.println("Default value for String :"+staticVariabledemo.amount);
//		System.out.println("Default value for String :"+staticVariabledemo.age);
//		System.out.println("Default value for String :"+staticVariabledemo.gender);
		
		
	}
	
	

}
