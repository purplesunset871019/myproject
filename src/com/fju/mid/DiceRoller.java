package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random ran = new Random();
		   
	       int x1;
	       int x2;
	       int x3;
	       int a;
	       int total1=0;
	       int total2=0;
	       int total3=0;
	       int total4=0;
	       int total5=0;
	       int total6=0;
	       
	       for(a=1;;a++)
	       {
	           x1=ran.nextInt(6)+1;
		       x2=ran.nextInt(6)+1;
		       x3=ran.nextInt(6)+1;
		    
			   System.out.print(x1+" "); 
			   System.out.print(x2+" "); 
			   System.out.print(x3+" ");
			
			   System.out.println(); 
			
			   if(x1==x2 && x2!=x3)
			   {
			       break;
		       }
			   if(x3==x2 && x3!=x1)
			   {
		    	   break;
		       }
		       if(x1==x3 && x1!=x2)
		       {
		    	   break;
		       }
	       
	           if(x1==6)
	           {
	    	       total6=total6+1;
	           }
	           else if(x2==6)
	           {
	    	       total6=total6+1; 
	           }
	           
	           else if(x3==6)
	           {
	    	       total6=total6+1;
	           }
	           
	           if(x1==1)
	           {
	    	       total1=total1+1;
	           }
	           else if(x2==1)
	           {
	    	       total1=total1+1; 
	           }
	           
	           else if(x3==1)
	           {
	    	       total1=total1+1;
	           }
	           
	           if(x1==2)
	           {
	    	       total2=total2+1;
	           }
	           else if(x2==2)
	           {
	    	       total2=total2+1; 
	           }
	           
	           else if(x3==2)
	           {
	    	       total2=total2+1;
	           }
	           
	           if(x1==3)
	           {
	    	       total3=total3+1;
	           }
	           else if(x2==3)
	           {
	    	       total3=total3+1; 
	           }
	           
	           else if(x3==3)
	           {
	    	       total3=total3+1;
	           }
	           
	           if(x1==4)
	           {
	    	       total4=total4+1;
	           }
	           else if(x2==4)
	           {
	    	       total4=total4+1; 
	           }
	           
	           else if(x3==4)
	           {
	    	       total4=total4+1;
	           }
	           
	           if(x1==5)
	           {
	    	       total5=total5+1;
	           }
	           else if(x2==5)
	           {
	    	       total5=total5+1; 
	           }
	           
	           else if(x3==5)
	           {
	    	       total5=total5+1;
	           }
	       }
	       
		    System.out.println("6總共出現過"+total6+"次"); 
		    System.out.println("1總共出現過"+total1+"次"); 
		    System.out.println("2總共出現過"+total2+"次"); 
		    System.out.println("3總共出現過"+total3+"次"); 
		    System.out.println("4總共出現過"+total4+"次"); 
		    System.out.println("5總共出現過"+total5+"次");
		    
	}

}
