package myproject;

import java.util.Random;

public class Smalltobig {
	public static void main(String[] args) {

	Random random= new Random();
	
	int a1=random.nextInt(); 
	int a2=random.nextInt(); 
	int a3=random.nextInt(); 
	int a4=random.nextInt(); 
	int a5=random.nextInt(); 
	int n[]=new int []{a1,a2,a3,a4,a5};
	int temp;
	
	for(int a=1;;a++)
	{
		for(int b=0;b<n.length-1;b++)
		{
			if(n[b]>=n[b+1])
			{
				temp=n[b];
				n[b]=n[b+1];
				n[b+1]=temp;
			}
		}
		
		if(n[0]<=n[1] && n[1]<=n[2] && n[2]<=n[3] && n[3]<=n[4])
		{
			break;
		}
	}
	
	System.out.print(n[0]+" "+n[1]+" "+n[2]+" "+n[3]+" "+n[4]);   
	
	}
}
