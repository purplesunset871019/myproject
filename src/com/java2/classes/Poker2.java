package com.java2.classes;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Poker2 {


      	Random random = new Random();
      	List<Integer> cards = new ArrayList<>();
      	
      	
		String flowers = "SHDC";
		public Poker2() {
			for (int i = 0; i <cards.size(); i++) {
				System.out.println(cards.get(i));
				System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
			}
		}
		
		public void shuffle(){
			for (int i=0; i<cards.size(); i++){
				int r =random.nextInt(52);
				int tmp = cards.get(i);
				cards.set(i, cards.get(r));
				cards.set(r, tmp);
			}
		}
		
		public void show(){
			for (int i=0; i<cards.size(); i++){
				int c = cards.get(i);
				System.out.print((c%13)+1 + "" + (flowers.charAt(c/13)) + " ");
				if (i%13==0){
					System.out.println();
				}
			}
		}
	
	
	
	
	
	   
}
