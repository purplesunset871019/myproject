package com.java2.snowing;

import java.util.ArrayList;
import java.util.List;

public class SnowTester extends Thread{
	

	/*public Snow {
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Snow snow = new Snow();
		//snow.start();
		
		List<Snow> snows = new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			Snow snow = new Snow(null);
			snow.start();
			snows.add(snow);
		}
	}

}
