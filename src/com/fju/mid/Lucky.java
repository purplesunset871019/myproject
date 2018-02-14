//輸入一個1-9的數字，並隨機選出六個1-9的數字，如果六個數字中有根樹入的數字一樣的數字，就輸出Yes，反之則輸出No
package com.fju.mid;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random ran = new Random();
			
			System.out.print("Please enter a number:");     
		    Scanner scanner = new Scanner(System.in);
		    String number1 = scanner.nextLine();
		    int number2 = Integer.parseInt(number1);	  
	     int x1;
	     int x2;	    
	     int x3;	
	     int x4;	
	     int x5;	
	     int x6;	   
		    
		    x1=ran.nextInt(9)+1;
		    x2=ran.nextInt(9)+1;
		    x3=ran.nextInt(9)+1;
		    x4=ran.nextInt(9)+1;
		    x5=ran.nextInt(9)+1;
		    x6=ran.nextInt(9)+1;
		    
			System.out.print(x1+" "); 
			System.out.print(x2+" "); 
			System.out.print(x3+" "); 
			System.out.print(x4+" "); 
			System.out.print(x5+" "); 
			System.out.print(x6+" "); 
			
			System.out.println(); 
			
		    if(x1==number2 ||x2==number2||x3==number2||x4==number2||x5==number2||x6==number2)
		    {
				System.out.print("Yes"); 
		    }
		    else
		    {
				System.out.print("No"); 
		    }
		    
	   /* for(int a=1;a<=6;a++)
		{		
		System.out.print(ran.nextInt(9)+1);
		System.out.print(" ");
		
				System.out.println();
			    int b=ran.nextInt();
	    if(b==number2)
	    {
			System.out.print("Yes"); 
	    }
	    
	    else
	    {
			System.out.print("No"); 
	    }
			
		}
	    
	    
	    
	    
*/

	    
	    
	    

	}

}
