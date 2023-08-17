package com.basicjava.ninthclass;

import java.util.Scanner;

public class parkingSystem {
	
	
	static int bikeTotalCapacity = 200;
	static int carTotalCapacity= 200;
	static int availableSpaceBike = 199;
	static int availableSpaceCar = 199;
	static double bikeNo,carNo;
	
	public static void displayMenu(Scanner sc) {
		 
		System.out.println("1.Park in");
		System.out.println("2.Park out");
		System.out.println("3.Display parking slots");
		System.out.println("4.Exit");
		int flag = 1;
		while(flag ==1) {
		System.out.println("Enter your desire option: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			parkingIn(sc);
			break;
		case 2:
			parkingOut(sc);
			break;
		case 3:
			System.out.println("The total slots available for Bikes is:  "+availableSpaceBike);
			System.out.println("The total slots available for Cars is:  "+availableSpaceCar);
			break;
		case 4:
			flag =0;
			break;
		default:
			System.out.println("Invalid input...............");
			
		}
		}
	}
	
	
	private static void parkingOut(Scanner sc) {
		System.out.println("1.For bike");
		System.out.println("2.for car");
		int option = sc.nextInt();
		if(option == 1)
		{
			System.out.println("Enter your bike no. : ");
			int check = sc.nextInt();
			
			if( check == bikeNo )
			{
				System.out.println("You can take your bike!");
				availableSpaceBike = availableSpaceBike + 1; 
			}else
			{
				System.out.println("you have no bike parked....!");
			}
			
		}
		
		if(option == 2)
		{
			System.out.println("Enter your Car no. : ");
			int check = sc.nextInt();
			
			if( check == carNo )
			{
				System.out.println("You can take your Car  !");
				availableSpaceCar = availableSpaceCar + 1; 
			}else
			{
				System.out.println("you have no car parked....!");
			}
			
		}
		
		
		
	}


	private static void parkingIn(Scanner sc) {
		
		System.out.println("1.For bike");
		System.out.println("2.for car");
		int option = sc.nextInt();
		if(option == 1)
		{
			if(availableSpaceBike!=0)
			{
				System.out.println("You can park your bike !");
				System.out.println("Enter your bike number : ");
				 int bikeNo = sc.nextInt();
				
				availableSpaceBike = availableSpaceBike - 1; 
				System.out.println("Your bike parked sucessfully....");
				
				//System.out.println("Your token number is : ");
			}
			else {
				System.out.println("Slot is pull!");
			}
			System.out.println("The available slot for bike is: "+availableSpaceBike);
			
		}
		else if(option == 2)
		{
			if(availableSpaceCar!=0)
			{
				System.out.println("You can park your car !");
				System.out.println("Enter your bike number : ");
				int carNo = sc.nextInt();
				
				availableSpaceCar = availableSpaceCar - 1; 
				
				//System.out.println("Your token number is : ");
			}
			else {
				System.out.println("Slot is pull!");
			}
			System.out.println("The available slot for car is: "+availableSpaceCar);
		}  
		
		
		
		
		
		
		
	}


	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		displayMenu(sc);
		
		
		
	}

}
