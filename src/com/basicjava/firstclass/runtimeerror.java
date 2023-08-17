package com.basicjava.firstclass;

public class runtimeerror {
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2  = 0;
		
		//without using try catch block throws errpr it is know as runtime error.
		int result =0;
		try {
		result = num1/num2;
		}catch(Exception e) {
			
		}
		System.out.println("Result :"+result);
		
		
	}

}
