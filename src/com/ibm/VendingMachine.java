//販賣機
package com.ibm;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a=15");
		System.out.println("b=20");   
		System.out.println("c=30");   
		
		int total=0;
		int a;

		
		for(a=1;;a++)			
		{
			System.out.println("販賣機餘額"+total);     
			System.out.print("請投幣或選擇飲料(a,b,c),或輸入0結束:");		

			Scanner scanner = new Scanner(System.in);
		    String Price = scanner.nextLine();
		    
			boolean leave = true;

				switch(Price)
			    {
				case "1":
			    	total=total+1;
			    	break;
			    case "5":
			    	total=total+5;
			    	break;
			    case "10":
			    	total=total+10;
			    	break;
			    case "a":
			    	if(total>=15)
			    	{
				    	total=total-15;
				    	System.out.println("DON!");
			    	}
			    	
			    	else
			    	{
				    	System.out.println("BEEP!");
			    	}
			    	break;
			    case "b":
			    	if(total>=20)
			    	{
				    	total=total-20;
				    	System.out.println("DON!");
			    	}
			    	
			    	else
			    	{
				    	System.out.println("BEEP!");
			    	}
			    	break;
			    case "c":
			    	if(total>=30)
			    	{
				    	total=total-30;
				    	System.out.println("DON!");
			    	}
			    	
			    	else
			    	{
				    	System.out.println("BEEP!");
			    	}
			    	break;
			    case "0":
			    	leave = false;
			    	break;
			    }

			if(leave)
			{
				break;
			}
		    
		}
	}

}
