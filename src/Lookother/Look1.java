package Lookother;

import java.util.Scanner;
import java.util.ArrayList;
public class Look1 {



	 
	  public static void main(String[] args){
	  ArrayList<String>  fruit = new ArrayList<String>();

	  fruit.add("Apple");
	  fruit.add("Banana");
	  fruit.add("group");

	  String desired= "Coconut";
	  fruit.set(2,desired);

	  int num=fruit.size();

	  for(int i=0;i<num;i++)
	  System.out.println(fruit.get(i));
	  System.out.println(num);
	  }

}