package com.fju.mid;

import java.util.Scanner;

public class Number2 {
	
	public static void main(String[] args) {
	
	System.out.print("Please enter a number:");     
    Scanner scanner = new Scanner(System.in);
    String number1 = scanner.nextLine();
    int number2 = Integer.parseInt(number1);	
	
    int a=1;
    
	while(a<=number2)
	{
    	System.out.print(a+" ");
    	a++;
	}
	
	
	}
}
