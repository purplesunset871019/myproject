package myproject;

import java.util.*;

public class Multiplicationtable2 {
	public static void main(String[] args) {

	    int a;
	    int b=1;    
	    
	    for(a=1;a<=9;a++)
	      {
	        for(b=1;b<=9;b++)
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
