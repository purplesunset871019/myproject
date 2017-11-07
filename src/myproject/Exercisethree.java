package myproject;

import java.util.*;

public class Exercisethree {
	public static void main(String[] args) {
	    System.out.println("以下誰的年紀最大？");     
	    System.out.println("(1) 杰倫");     
	    System.out.println("(2) 華宸宇");     
	    System.out.println("(3) 梁朝偉");     
	    
	    System.out.println("Which number do yo choose？");     
	    Scanner scanner = new Scanner(System.in);
	    String number1 = scanner.nextLine();
	    int number2 = Integer.parseInt(number1);
	    
		if(number2==3)
		{
		    System.out.print("Ture");    
		}
		
		else if(number2==1 || number2==2)
		{
		    System.out.print("False");    
		}
		
		else
		{
		    System.out.println("Please read the topic again");
		}
	}
}
