package com.coding.frenzy;

import java.util.Scanner;

public class A013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		int a=1;
		
		System.out.print("Please enter the month:");     
	    Scanner scanner1 = new Scanner(System.in);
	    String line1 = scanner1.nextLine();
	    int number1 = Integer.parseInt(line1);
	    
		System.out.print("Please enter the day:");     
	    Scanner scanner2 = new Scanner(System.in);
	    String line2 = scanner2.nextLine();
	    int number2 = Integer.parseInt(line2);	
		
		int n[]=new int []{31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i:n)
		{
			if(a==number1)
			{
				total=total+number2;
				break;
			}
			
			if(a!=number1)
			{
				total=total+i;
			}
			a++;
		}
		
		System.out.println(total);   
	}
}
