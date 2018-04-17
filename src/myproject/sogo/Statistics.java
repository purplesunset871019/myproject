package myproject.sogo;

import java.beans.Customizer;
import java.util.ArrayList;

public class Statistics {

	public static void main(String[] args) {
		
		/*ArrayList<Customer> customers=new ArrayList<>();
		
		customers.add(new Customer(10000));
		customers.add(new SliverCustomer(10000));
		customers.add(new GoldCustomer(10000));
				
		for(int i=0;i<customers.size();i++)
		{
			Customer c=customers.get(i);
			c.print();
		}*/
		
		Customer c1= new Customer(1004);
		c1.print();
		SilverCustomer c2=new SilverCustomer(1004);
		c2.print();
	    GoldCustomer c3=new GoldCustomer(1004);
		c3.print();
		
	}

}
