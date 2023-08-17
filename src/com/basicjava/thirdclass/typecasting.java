package com.basicjava.thirdclass;

public class typecasting {
	
	public static void main(String[] args) {
		
		//windening type casting
		int num1 = 32;
		
		double inttodouble = num1;
		
		
		System.out.println("Original number :"+num1);
		System.out.println("after performing WTC :"+inttodouble);
		
		
		
		//narrowing type casting 
		
		double num2 = 736.736674;
		int doubletoint = (int)num2;
		
		System.out.println("Original number :"+num2);
		System.out.println("after performing WTC :"+doubletoint);
		
		String data ="300";
		int stringtoint = Integer.valueOf(data);
		
		
		System.out.println("Original number :"+data);
		System.out.println("after performing WTC :"+stringtoint);
		
		
		double salary = 736538.32736;
		String doubletoString = String.valueOf(salary);
		
		System.out.println("Original number :"+salary);
		System.out.println("after performing WTC :"+doubletoString);
		
		
		Double income = 27355.23;
		double Doubletodouble = income.doubleValue();
		
		
		String incomeData = "732246.6236";
		double dataResult = Double.parseDouble(incomeData);
		
		
		
		char Data = 'M';
		int res = (int) Data;
		
		System.out.println("Original number :"+Data);
		System.out.println("after performing WTC :"+res);
		
		
		
		
		
		
		
	}

}
