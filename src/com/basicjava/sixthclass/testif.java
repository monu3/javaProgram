package com.basicjava.sixthclass;

import java.util.Scanner;

public class testif {
	
	
	public static void compare(int a, int b, int c)
	{
		if(a>b && a>c )
		{
			System.out.println("Here the Greatest number is: "+a);
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three number :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		compare(num1,num2,num3);
		compare(num2,num1,num3);
		compare(num3,num1,num2);
		
		//if(num1>num2?num1>num3:num1)
		
//		if(num1>num2 && num1>num3)
//		{
//			System.out.println("Here the num1 is greatest : "+num1);
//		}
//		if(num2>num1 && num2>num3)
//		{
//			System.out.println("Here the num2 is greatest : "+num2);
//		}
//		if(num3>num1 && num3>num2)
//		{
//			System.out.println("Here the num3 is greatest : "+num3);
//		}
		
		
		
		//if(num1>num2 && num1>num3)?num1:((num2>num1 && num2>num3)?num2:num3);
		sc.close();
	}

}
