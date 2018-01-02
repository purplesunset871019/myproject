package myproject.sogo;

public class Costumer {

	int amount;
	float discount=0.05f;
	public Costumer(int amount){
		this.amount=amount;
	}
	
	public void print(){
		int total=(int)(amount*(1-discount));
		System.out.println(amount+"/t"+total);
	}
}
