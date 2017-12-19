package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int n=1;
		
		for(a=1;a<=100;a++)
		{
			if(a%3==0)
			{
				System.out.print(a+"	");
				if(n%5==0)
				{
					System.out.println();
				}
				
				n++;
			}
			

		}
		
	}

}
