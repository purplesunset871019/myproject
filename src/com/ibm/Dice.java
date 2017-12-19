package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Random ran = new Random();
	       
	       int x1;
	       int x2;
	       int x3;
	       int x4;
	       
	       for(int a=1;a<=10;a++)
	       {
	           x1=ran.nextInt(6)+1;
		       x2=ran.nextInt(6)+1;
		       x3=ran.nextInt(6)+1;
		       x4=ran.nextInt(6)+1;
		    
			   System.out.print(x1+" "); 
			   System.out.print(x2+" "); 
			   System.out.print(x3+" ");
			   System.out.print(x4+" ");
			   
			   if(x1!=x2&&x1!=x3&&x1!=x4&&x2!=x3&&x2!=x4&&x3!=x4)
			   {
				   System.out.print("*");
			   }
				   
			   System.out.println(); 
	       }
	}

}
