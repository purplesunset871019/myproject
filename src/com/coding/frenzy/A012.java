//(A012) 標準分解式 : 輸入一正整數N，輸出N的標準分解式。 
package com.coding.frenzy;

import java.util.Scanner;

public class A012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
				
		int a;
		int b;
		int c;
		int d;
		int e;
	
		for(e=2;e<=number;e++)
		{
			if(number%e==0)
			{
				break;
			}
		}
		
		if(e==number)
		{
			System.out.print(1+"*");  
		}
		
		for(a=2;a<=number;a++)
		{
			/*for(e=2;e<=number;e++)
			{
				if(number%e==0)
				{
					break;
				}
			}
			
			if(e==number)
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
				if(number % a ==0)
				{
				number=number/a;	
				System.out.print(a);  
				}
				else
				{
					break;
				}
				
                for(c=a;c<=number;c++)
                {
                	if(number%c==0)
                	{
        				System.out.print("*");
        				break;
                	}

                }
			}
						
		}
				
/*		for(d=2;d<=number;d++)
		{
			if(number%d==0)
			{
				System.out.print(d);  
				number=number/d;
			}
			else
			{
				break;
			}
		}
		
				
		for(a=2;a<=number;a++)
		{
			for(b=1;;b++)
			{
				if(number % a ==0)
				{
				number=number/a;	
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
