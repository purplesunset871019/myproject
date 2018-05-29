package com.java2.snowing;

import java.awt.Canvas;
import java.util.Random;

public class Snow extends Thread{
	
	Random random = new Random();
	int x;
	int y = 800;
	private Canvas canvas;
	
	public Snow(Canvas canvas){
		this.canvas = canvas;
		x=random.nextInt(600);
		y=random.nextInt(800);
	}
	
	@Override
	public void run(){
		for (int i=800;i>0;i--)
		{
			System.out.println(getName()+":("+x+","+")");
			y=y-1;
			int movement = random.nextInt(3)-1;
			x=x-movement;
			try {
				sleep(50);
				canvas.repaint();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			//System.out.print(new String(new char[x]).replaceAll("\0", " "));
			//System.out.println("雪");
		}
	}
}
