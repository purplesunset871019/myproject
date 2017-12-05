/*(A010) 畢氏數 : 輸入一個正整數n，輸出所有的 (a,b,c) 滿足
1. a,b,c為三個正整數
2. a小於b小於c小於n 
3. a^2 +b^2=c^2 
4. a,b,c 三數的最大公因數為 1。  */
package com.coding.frenzy;

import java.util.Scanner;

public class A010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.print("Please enter a number:");     
	Scanner scanner = new Scanner(System.in);
	String number1 = scanner.nextLine();
	int n = Integer.parseInt(number1);	
		
	int a;
	int b;
	int c;
    int p;
    int m=1;
	
	for(a=1;a<n;a++)
	{
		for(b=a+1;b<n;b++)
		{
			for(c=b+1;c<n;c++)
			{
				for(p=1;p<=a;p++)
				{
					if(a%p==0 && b%p==0 && c%p==0)
					{
						m=p;
					}
				}
				if(m==1 && a*a+b*b==c*c)
				{
					System.out.print(a+"	");
					System.out.print(b+"	");
					System.out.print(c);
					System.out.println();
				}
			}
		}
	}
	}

}
