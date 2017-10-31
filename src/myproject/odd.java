package myproject;

import java.util.*;

public class odd {
	public static void main(String[] args) {

		    int a;
		    int b=1;    
		    
		    for(a=1;a<=9;a++)
		      {
		        for(b=1;b<=9;b++)
		          {
		            if(a*b<10)
		              {
		            	System.out.printf("%d*%d= %d ",a,b,a*b);
		              }
		              
		            else
		            {
		            	System.out.printf("%d*%d=%d ",a,b,a*b);
		              }
		          }
		        System.out.println();
		      }
		      
	
		}
}