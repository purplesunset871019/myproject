//(A012) 標準分解式 : 輸入一正整數N，輸出N的標準分解式。 
package com.coding.frenzy;

import java.util.Scanner;

public class A012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    String number1 = scanner.nextLine();
	    int number2 = Integer.parseInt(number1);	
				
		int a;
		int b;
		int c;
		int d;
		int e;
	
		for(e=2;e<=number2;e++)
		{
			if(number2%e==0)
			{
				break;
			}
		}
		
		if(e==number2)
		{
			System.out.print(1+"*");  
		}
		
		for(a=2;a<=number2;a++)
		{
			/*for(e=2;e<=number2;e++)
			{
				if(number2%e==0)
				{
					break;
				}
			}
			
			if(e==number2)
			{
				System.out.print(1+"*");  
			}*/
			/*boolean prime=true;
			
		    for(j=2;j<a;j++)
		    {
		    	if(a%j==0)
		    	{
	            	prime=false;
	            	break;
		    	}
		    }
		    	if(prime)
		    	{
		    	System.out.print(a);
		    	}   */
		    	
		    	for(b=1;;b++)
			{
				if(number2 % a ==0)
				{
				number2=number2/a;	
				System.out.print(a);  
				}
				else
				{
					break;
				}
				
                for(c=a;c<=number2;c++)
                {
                	if(number2%c==0)
                	{
        				System.out.print("*");
        				break;
                	}

                }
			}
						
		}
				
/*		for(d=2;d<=number2;d++)
		{
			if(number2%d==0)
			{
				System.out.print(d);  
				number2=number2/d;
			}
			else
			{
				break;
			}
		}
		
				
		for(a=2;a<=number2;a++)
		{
			for(b=1;;b++)
			{
				if(number2 % a ==0)
				{
				number2=number2/a;	
				System.out.print("*"+a);  
				}
				else
				{
					break;
				}
				
 
			}
			
			
		}
*/		
				
	}

}
