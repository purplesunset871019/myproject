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


	}

}
