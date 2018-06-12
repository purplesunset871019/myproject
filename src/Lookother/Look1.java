package Lookother;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Look1 {

	

	List<Look2> drinks = new ArrayList<>();
	
	public void on(){
		System.out.println("Please insert coins...");
		for (int i=0; i<drinks.size(); i++){
			Look2 drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int data = -1;
		while (data != 0){
			data = scanner.nextInt();
			switch(data){
			case 0:
				break;
			}
		}
	}

}