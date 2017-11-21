package com.coding.frenzy;

import java.util.Scanner;

public class Practice {

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
	    
	    if(number1==2)
	    {
			System.out.print(number2+31);   
	    }
	    
	    else if(number1%2==0)
	    {
			System.out.print(31*(number1/2-1)+30*(number1/2)+number2);   
	    }
	    
	    else
	    {
			System.out.print(31*(number1/2-1)+30*(number1/2)+number2); 
	    }
	}

}
