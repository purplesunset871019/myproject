package Practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
	    System.out.println("Which number do yo choose?");     
	    Scanner scanner = new Scanner(System.in);
	    String number1 = scanner.nextLine();
	    int number2 = Integer.parseInt(number1);		
		  
	    int a;
    	int b=1;
        int c=number2-1;
        int e=1;
		for(a=1;a<=number2;a++)
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
