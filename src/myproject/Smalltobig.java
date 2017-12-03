package myproject;

public class Smalltobig {
	public static void main(String[] args) {

	int n[]=new int []{45,56,87,34,86};
	int temp;
	
	for(int a=1;;a++)
	{
		for(int b=0;b<n.length;b++)
		{
			if(n[b]>=n[b+1])
			{
				temp=n[b];
				n[b]=n[b+1];
				n[b+1]=temp;
			}
		/*if(n[0]>=n[1])
		{
			temp=n[0];
			n[0]=n[1];
			n[1]=temp;
		}
		if(n[1]>=n[2])
		{
			temp=n[1];
			n[0]=n[2];
			n[1]=temp;
		}
		if(n[0]>=n[1])
		{
			temp=n[0];
			n[0]=n[1];
			n[1]=temp;
		}
		if(n[0]>=n[1])
		{
			temp=n[0];
			n[0]=n[1];
			n[1]=temp;*/
		}
		
		if(n[0]<=n[1] && n[1]<=n[2] && n[2]<=n[3] && n[3]<=n[4])
		{
			break;
		}
		
		
		
	}
	
	System.out.print(n[0]+" "+n[1]+" "+n[2]+" "+n[3]+" "+n[4]);   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
