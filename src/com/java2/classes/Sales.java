package com.java2.classes;

public class Sales {
	int type;
	int amount;
	public Sales(){
		
	}
	public Sales(int type, int amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	public int getType() {
		return type;//丟出
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;//丟出
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}