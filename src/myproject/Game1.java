//兩使用者玩數字比大小遊戲
package myproject;

import java.util.*;

public class Game1 {
	public static void main(String[] args) {
	    System.out.print("player1 please enter your name:");     
	    Scanner scanner = new Scanner(System.in);
	    String name1 = scanner.nextLine();
	    System.out.println("Hello,"+name1);
		
	    System.out.print("Which number do you choose？");     
	    Scanner scanner2 = new Scanner(System.in);
	    int number1 = scanner2.nextInt();
	    
	   	    
	    System.out.print("player2 please enter your name:");
	    Scanner scanner3= new Scanner(System.in);
	    String name2 = scanner3.nextLine();
	    System.out.println("Hello,"+name2); 
	    
	    System.out.print("Which number do you choose？");     
	    Scanner scanner4 = new Scanner(System.in);
	    int number2 = scanner4.nextInt();
	  	        
	    if(number1 > number2)
	        {
		    System.out.println("Winner is "+name1);
	        }
	  
	    else if(number1 < number2)
	        {
		    System.out.println("Winner is "+name2);
	        }
	    else
	        {
		    System.out.println("Draw");
	        }
	    
	}
}
