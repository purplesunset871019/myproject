package myproject.sogo;

public class SliverCustomer extends Customer {
	public SliverCustomer(int amount)
	{
		super(amount);
		super.discount=0.1f;
	}
}
