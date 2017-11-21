package myproject;

import java.util.*;

public class Game1 {
	public static void main(String[] args) {
	    System.out.println("player1 please enter your name");     
	    Scanner scanner = new Scanner(System.in);
	    String line1 = scanner.nextLine();
	    System.out.println("Hello,"+line1);
		
	    System.out.println("Which number do you choose?");     
	    Scanner scanner2 = new Scanner(System.in);
	    String number1 = scanner2.nextLine();
	    int number2 = Integer.parseInt(number1);
	    
	    System.out.println("player2 please enter your name");
	    Scanner scanner3= new Scanner(System.in);
	    String line2 = scanner3.nextLine();
	    System.out.println("Hello,"+line2); 
	    
	    System.out.println("Which number do you choose?");     
	    Scanner scanner4 = new Scanner(System.in);
	    String number3 = scanner4.nextLine();
	    int number4 = Integer.parseInt(number3);
	        
	    if(number2 > number4)
	        {
		    System.out.println(line1 +"win");
	        }
	  
	    else if(number2 < number4)
	        {
		    System.out.println(line2 +"win");
	        }
	    else
	        {
		    System.out.println("Draw");
	        }
	    
	}
}
