package com.java2.collection;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	SortedSet<String> set = new TreeSet<>(Arrays.asList("Alpha, Gamma, Omega"));
	
	System.out.println(set);;
*/
	    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

		for(String name : nameSet)
		{
			System.out.println(name);
		}
		
		
	}

}
