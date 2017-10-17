package myproject;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int age = 87 ;
        int b;
        int c;
        int d;
        b=age*2;
        d=b*b;
        c=d*age;
        age=c;
        
        short e = 6 ;
        float f = 15.6f ;
        char g = 65 ;
        char g2 = 'Z';
        int h=g2;
        boolean pass = true;
    
    
    System.out.println(age); 
    System.out.println(b); 
    System.out.println(c); 
    System.out.println(d); 
    System.out.println(e); 
    System.out.println(f); 
    System.out.println(g); 
    System.out.println(g2); 
    System.out.println(h); 
    System.out.println(pass); 
    System.out.println(!pass);
    
    boolean pass2 = pass;
    System.out.println(pass2);
    System.out.println(!pass2); 
    
    String s = new String("Hellow"); 
    Random m = new Random();
    int n1 = m.nextInt();
    
	}

}
