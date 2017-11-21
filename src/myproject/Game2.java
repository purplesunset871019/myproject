package myproject;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number:");     
		
	    int a;
	    
		for(a=1;;a++)
		{
		    Scanner scanner = new Scanner(System.in);
		    String Line = scanner.nextLine();
		    int number = Integer.parseInt(Line);	
			
			if(number==8||number==4||number==2||number==6)
			{
				switch(number)
				{
				case 8:
					System.out.println("向上");    
					break;
				case 2:
					System.out.println("向下");    
					break;
				case 4:
					System.out.println("向左");    
					break;	
				case 6:
					System.out.println("向右");    
					break;
				}
			}
			
			else if(number==0)
			{
				System.out.println("Game over");    
				break;
			}
			
			else
			{
				System.out.println("Wrong"); 
			}
			
		}
		
	}

}
