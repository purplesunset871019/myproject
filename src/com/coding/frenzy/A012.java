package com.coding.frenzy;

import java.util.Scanner;

public class A012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    String number1 = scanner.nextLine();
	    int number2 = Integer.parseInt(number1);	
				
		int a;
		int b;
		int c;
		int d;
		
		for(d=2;d<=number2;d++)
		{
			if(number2%d==0)
			{
				System.out.print(d);  
				number2=number2/d;
			}
		}
		
				
		for(a=2;a<=number2;a++)
		{
			for(b=1;;b++)
			{
				if(number2 % a ==0)
				{
				number2=number2/a;	
				System.out.print("*"+a);  
				}
				else
				{
					break;
				}
				
 
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
