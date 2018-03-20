package com.java2.classes;

import java.util.Scanner;

public class ABgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "6584";
		int A;
		int B;
		
		for(int a=0;;a++)
		{
			A=0;
			B=0;
			System.out.print("Please enter your guess:");     
			Scanner scanner = new Scanner(System.in);
		    String n = scanner.nextLine();
			
			int l = n.length();
			if(l==4)
			{
				for (int i = 0; i < l; i++)
				{
					char c1 = s.charAt(i);
					for (int j = 0; j < l; j++) 
					{
						char c2 = n.charAt(j);
						if (i==j&&c1 == c2) 
						{
							A++;
						}
						
						if (i!=j&&c1==c2)
						{
							B++;
						}
					}
								


				}
				System.out.println(A+"A"+B+"B");
				
				if(A==4)
				{
					System.out.println("you win");
					break;
				}
			}
			
			else
			{
				System.out.println("Please enter the Thousands digits");
			}
			
		}

	}

}
