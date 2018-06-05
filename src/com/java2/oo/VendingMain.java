package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class VendingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try{
			FileInputStream fis = new FileInputStream("vending.txt");
			fr = new FileReader("vending.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for(int i=0; i < count;i++){
				String name = tokens[i*2+1];
				int price = Integer.parseInt(tokens[i*2+2]);
				vm.drinks.add(new Drink(i+1, name, price));
			}
			vm.on();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
