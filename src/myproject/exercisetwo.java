package myproject;

import java.util.*;

public class exercisetwo {
	public static void main(String[] args) {

	    int a;
	    int b=1;    
	    
	    for(a=1;a<=9;a++)
	      {
	        for(b=2;b<=5;b++)
	        {
            if(a*b<10)
              {
            	System.out.print(b+"x"+a+"= "+(a*b)+" ");
              }
              
            else
            {
            	System.out.print(b+"x"+a+"="+(a*b)+" ");
              }
	        }
	        System.out.println();
	      }
	      

	}
}