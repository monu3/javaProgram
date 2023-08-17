package com.basicjava.ninthday;

public class pattern {
	
	
	public static void main(String[] args) {
		
		
		int row = 0;
		//int column = 0;
//		while(row<4) {
//			row ++;
//			
//			do {
//				System.out.println("*");
//				row++;
//				//row ++;
//			}while(row==3);
//			System.out.println("*");
//			
//			//row ++;
		do {
			int column =0;
			do {
				System.out.print("*");
				column++;
				
			}while(row>=column);
			System.out.println(" ");
			row++;
		}while(row<=3);
	}

}
