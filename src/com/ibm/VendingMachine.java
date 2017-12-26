package com.ibm;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=0;
		String money;
		int a;
		for(a=1;;a++)
		{
			System.out.println("販賣機餘額"+total);     
			System.out.print("請投幣或選擇飲料(a,b,c),或輸入0結束"+":");		

			Scanner scanner = new Scanner(System.in);
		    String Price = scanner.nextLine();

			/*if(Price=="1"||Price=="5"||Price=="10"||Price=="a"||Price=="b"||Price=="c")
			{
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

			    }

		    }
			else if(Price=="0")
			{
				break;
			}*/
		    
		    if(Price=="1")
		    {
		    	total=total+1;
		    }
		    else if(Price=="5")
		    {
		    	total=total+5;
		    }
		    else if(Price=="10")
		    {
		    	total=total+10;
		    }
		    else if(Price=="a")
		    {
		    	if(total>=15)
		    	{
			    	total=total-15;
			    	System.out.println("DON!");
		    	}
		    	
		    	else
		    	{
			    	System.out.println("BEEP!");
		    	}
		    }
		    else if(Price=="b")
		    {
		    	if(total>=20)
		    	{
			    	total=total-20;
			    	System.out.println("DON!");
		    	}
		    	
		    	else
		    	{
			    	System.out.println("BEEP!");
		    	}
		    }
		    else if(Price=="c")
		    {
		    	if(total>=30)
		    	{
			    	total=total-30;
			    	System.out.println("DON!");
		    	}
		    	
		    	else
		    	{
			    	System.out.println("BEEP!");
		    	}
		    }
		    else if(Price=="0")
		    {
		    	break;
		    }
		    
		}
	}

}
