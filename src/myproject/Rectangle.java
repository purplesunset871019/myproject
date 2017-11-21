package myproject;

import java.util.*;

public class Rectangle {
	public static void main(String[] args) {
		
	    System.out.println("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    String number = scanner.nextLine();
	    int number2 = Integer.parseInt(number);
	    
		int a;
		int b;
		int a2;
		int b2;
		
		for(a=1;a<=number2;a++)
		  {
			b=number2-a;
			
			for(a2=1;a2<=a;a2++)
			{            	
				System.out.print("*");
		    }
			
			for(b2=1;b2<=b;b2++)
			{
            	System.out.print("#");
			}
        	System.out.println();
		  }
		
		
		
	}
}
