package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b=1;    
		
		for(a=1;a<=9;a++)
		{
			for(b=2;b<=9;b++)
			{
				if(a*b<10)
			    {
					System.out.printf(b+"x"+a+"= "+(a*b)+" ");
			    }
			              
			    else
			    {
			        System.out.printf(b+"x"+a+"="+(a*b)+" ");
			    }
			 }
			
		System.out.println();
		}
	}

}
