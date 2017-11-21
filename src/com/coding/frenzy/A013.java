package com.coding.frenzy;

import java.util.Scanner;

public class A013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the month:");     
	    Scanner scanner = new Scanner(System.in);
	    String Line1 = scanner.nextLine();
	    int number1 = Integer.parseInt(Line1);	
	    
		System.out.print("Please enter the day:");     
	    Scanner scanner2 = new Scanner(System.in);
	    String Line2 = scanner2.nextLine();
	    int number2 = Integer.parseInt(Line2);
	    
	    int b;
	    
	    switch(number1)
	    {
	    case 1:
			System.out.print(31*(number1-1)+number2); 
	    case 2:
			System.out.print(31+number2); 
	    case 3:
			System.out.print(31*((number1+1)/2)+30*(((number1-1)/2)-1)+number2+28); 
	    case 4:
			System.out.print(31*(number1/2-1)+30*(number1/2)+number2+28); 
	    case 5:
			System.out.print(31*((number1+1)/2)+30*(((number1-1)/2)-1)+number2+28); 
	    case 6:
			System.out.print(31*(number1/2-1)+30*(number1/2)+number2+28); 
	    case 7:
			System.out.print(31*((number1+1)/2)+30*(((number1-1)/2)-1)+number2+28);  
	    case 8:
			System.out.print(31*(number1-1)+number2); 
	    case 9:
			System.out.print(31*(number1-1)+number2); 
	    case 10:
			System.out.print(31*(number1-1)+number2); 	
	    case 11:
			System.out.print(31*(number1-1)+number2); 
	    case 12:
			System.out.print(31*(number1-1)+number2); 
	    
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
