package myproject;

import java.util.*;

public class Exercisefour {
	public static void main(String[] args) {
		
		int a;
		int b;
		int a2;
		int b2;
		
		for(a=1;a<=6;a++)
		  {
			b=6-a;
			
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
