package myproject;

import java.util.*;

public class Exercisefour {
	public static void main(String[] args) {
	
	    System.out.println("Which number do yo choose？");     
	    Scanner scanner = new Scanner(System.in);
	    String number1 = scanner.nextLine();
	    int number2 = Integer.parseInt(number1);
	    
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
