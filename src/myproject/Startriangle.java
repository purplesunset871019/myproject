//本題概要是依照使用者給的層數來做出一個星號組成的等腰三角形
package myproject;

import java.util.Scanner;

public class Startriangle {
	
	public static void main(String[] args) {
		
		System.out.print("請選一個數字:");     
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    System.out.println("以下是您要的圖形。"); 	
		  
	    int a;
    	int b=1;
        int c=number-1;
        int e=1;
		for(a=1;a<=number;a++)
		{
			int d=2*a-1;
				
			for(e=1;e<=c;e++)
			{
                System.out.print(" "); 
			}
				
			for(int f=1;f<=d;f++)
			{
                System.out.print("*"); 
			}
				
			for(e=1;e<=c;e++)
			{
                System.out.print(" "); 
			}
				
			c=c-1;
			System.out.println(); 
			}
	}

}
