package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2,0,1,7);
		System.out.println(list);
		
		
	    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
	    String[] strArray = nameList.toArray(new String[0]);
	    for (int i = 0; i < strArray.length; i++) {
	      System.out.println(strArray[i]);
	    }
	}

}
