package com.basicjava.sixthclass;

import java.util.Scanner;

public class ifElseDemo {
	
	public static void main(String[] args) {
		
		
		
//		String courseName = "Java";
//		
//		if(courseName.equals("Java"))
//		{
//			System.out.println("Your intersted subjects is : "+courseName);
//		}
//		else
//		{
//			System.out.println("Yours instersted subject is :FrontEnd");
//		}
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the subjects:");
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		int mark5 = sc.nextInt();
		
		
		
		int sum = mark1 + mark2 + mark3 +mark4 + mark5;
		int per = (sum*100)/500;
		System.out.println("Total percentage is : "+per);
		
		if(per>=80)
		{
			System.out.println("distinction");
			return;
		}
		if(per>=60 && per<80)
		{
			System.out.println("first division");
			return;
		}
		if(per>=50 && per<60)
		{
			System.out.println("Second division");
			return;
		}
		if(per>=40 && per<50)
		{
			System.out.println("Third division");
			return;
		}
		else{
			System.out.println("Fail");
		}
		
			
		
		
	}

}
