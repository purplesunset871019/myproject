//測試用
package com.coding.frenzy;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the month:");     
	    Scanner scanner = new Scanner(System.in);
	    int number1 = scanner.nextInt();
	    
		System.out.print("Please enter the day:");     
	    Scanner scanner2 = new Scanner(System.in);
	    int number2 = scanner2.nextInt();
	    
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
