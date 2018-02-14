//輸入一個數字，輸出從1到該數字，並且每當遇到5的倍數時，在前面加#符號
package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    String number1 = scanner.nextLine();
	    int number2 = Integer.parseInt(number1);	
		
	    int a=1;
	    
		for(a=1;a<=number2;a++)
		{
			if(a%5==0)
			{
				System.out.print("#"+" ");  
			}
			
			System.out.print(a+" "); 
			
			/*if(a>=10)
			{
				break;
			}*/
		}
			
	}

}
