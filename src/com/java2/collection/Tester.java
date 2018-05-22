package com.java2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(4);
		list.add(6);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(4);
		set.add(1);
		set.add(8);
		set.add(4);
		set.add(6);
		System.out.println(set);
		Set<Double> set2 = new HashSet<>();
		set2.add(4.2654);
		set2.add(6.55);
		set2.add(1.763);
		set2.add(8.576981);
		set2.add(4.4864);
		set2.add(6.49863);
		System.out.println(set2);
		
		Map<String,String> stocks=new TreeMap<>();
		stocks.put("2356","公司1");
		stocks.put("6462","公司2");
		
		
		
		
		
		
	}

}
