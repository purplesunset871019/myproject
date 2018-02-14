//(A013) 年月日算第幾天 : 輸入西元年月日，算該日是該年的第幾天。 
package com.coding.frenzy;

import java.util.Scanner;

public class A013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		int a=1;
		
		System.out.print("Please enter the month:");     
	    Scanner scanner1 = new Scanner(System.in);
	    int number1 = scanner1.nextInt();
	    
		System.out.print("Please enter the day:");     
	    Scanner scanner2 = new Scanner(System.in);
	    int number2 = scanner2.nextInt();	
		
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
