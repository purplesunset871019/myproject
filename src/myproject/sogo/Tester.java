package myproject.sogo;

import java.beans.Customizer;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers=new ArrayList<>();
		
		customers.add(new Customer(10000));
		customers.add(new SliverCustomer(10000));
		customers.add(new GoldCustomer(10000));
		
		/*int n=list.get(2);
		int n2=list.get(3);
		
		System.out.println(list.get(1));
		System.out.println(list.size());*/
		
		for(int i=0;i<customers.size();i++)
		{
			Customer c=customers.get(i);
			c.print();
		}
		
		//Customer c1= new Customer(1000);
		c1.print();
		//SliverCustomer c2=new SliverCustomer(1000);
		c2.print();
		
	}

}
