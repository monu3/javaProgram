package com.basicjava.ninthday;

public class forLoopDemo {
	
	public static void main(String[] args) {
		
//		
//		for(int i = 2;i<=100;i=i+2)
//		{
//			System.out.print(i+",");
//			
//		}
//		System.out.println("");
//		for(int i = 1;i<=100;i=i+2)
//		{
//			System.out.print(i+",");
//			
//		}
		
		for(int i=1;i<=10;i++)
		{
			int count =1;
			do {
				
				System.out.println(i+ " * " +count+ " = "+i*count);
				count = count +1;
			}while(count<=10);
			System.out.println("");
		}
	}

}
