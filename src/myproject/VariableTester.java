package myproject;

import java.util.*;

public class VariableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
        short e = 6 ;
        float f = 15.6f ;
        char g = 65 ;
        char g2 = 'Z';
        int h=g2;
        boolean pass = true;
    
    boolean pass2 = pass;
    System.out.println(pass2);
    System.out.println(!pass2); 
    
    String s = new String("Hellow"); 
    Random m = new Random();
    int n1 = m.nextInt();
    int len = s.length();
    System.out.println("len," + len); 
    System.out.println(s.charAt(0)); 

    System.out.println("player1 please enter your name");     
    Scanner scanner = new Scanner(System.in);
    String line1 = scanner.nextLine();
    System.out.println("Hello,"+line1);
	
    System.out.println("Which number do you choose");
    line1 = scanner.nextLine();
    int number1 = Integer.parseInt(line1);
    
    System.out.println("player2 please enter your name");
    Scanner scanner2 = new Scanner(System.in);
    String line2 = scanner2.nextLine();
    System.out.println("Hello,"+line2); 
    
    
    player2=line2;
    
    System.out.println("Which number do you choose?");
    line2 = scanner2.nextLine();
    int number2 = Integer.parseInt(line2);
        
    if(number1 > number2)
        {
	    System.out.println(line1 +"win");
        }
  
    else if(number1 < number2)
        {
	    System.out.println(line2 +"win");
        }
    else
        {
	    System.out.println("Draw");
        }
    
	}

}
