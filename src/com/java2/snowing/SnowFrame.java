package com.java2.snowing;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class SnowFrame extends JFrame{
	SnowCanvas canvas = new SnowCanvas();
	//List<Snow> snows = new ArrayList<>();
	public SnowFrame(){
		setSize(620,80);
		setLocation(620, 850);
		add(canvas);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	//SnowCanvas canvas = new Snowcanvas;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SnowFrame();

	}
	
	public class SnowCanvas extends Canvas{
		List<Snow> snows = new ArrayList<>();
		public SnowCanvas(){
			for(int i=0;i<100;i++){
				Snow snow = new Snow(this);
				snow.start();
				snows.add(snow);
			}
		}
	}
	
	@Override
	public void paint(Graphics g){
		g.drawString("雪", 300, 400);
	}
}
