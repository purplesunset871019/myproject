package Lookother;

public class Look2 {
	int id;
	String name;
	int price;
	public Look2(){
		
	}
	public Look2(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
