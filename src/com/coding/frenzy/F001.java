package com.coding.frenzy;

import java.util.Scanner;

public class F001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scanner1 = new Scanner(System.in);
	    String line1 = scanner1.nextLine();
	    int number1 = Integer.parseInt(line1);
		
	    Scanner scanner2 = new Scanner(System.in);
	    String line2 = scanner2.nextLine();
	    int number2 = Integer.parseInt(line2);
	 
	    System.out.println(number1+number2);
	}

}
