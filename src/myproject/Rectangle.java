//輸出5*5方陣，其中包含左上到右下之對角線往下為*，其餘為#
package myproject;

import java.util.*;

public class Rectangle {
	public static void main(String[] args) {
		
	    System.out.println("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    
		int a;
		int b;
		int a2;
		int b2;
		
		for(a=1;a<=number;a++)
		  {
			b=number-a;
			
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
