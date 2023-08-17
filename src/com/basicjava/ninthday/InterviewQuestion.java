package com.basicjava.ninthday;

import java.util.Scanner;

public class InterviewQuestion {
	
	static int count =0;
	public static int factorOfTwoCount(int num){
		
		while(num%2==0)
		{
		 num =num/2;
		 count ++;
		}
		return count;
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		int num = sc.nextInt();
		factorOfTwoCount(num);
		System.out.println("Result:"+count);
		
		
		
	}
}
