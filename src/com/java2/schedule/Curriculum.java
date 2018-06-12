package com.java2.schedule;

public class Curriculum {
	
	int id;
	String name;
	int day;
	int time;
	int pttime;
	
	public Curriculum(int id,String name,int day,int time,int pttime) {
		super();
		this.day = day;
		this.name = name;
		this.time = time;
		this.pttime = pttime;
		this.id = id;
		}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getTime(){
		return time;
	}
	
	public int getPttime(){
		return pttime;
	}
	
}
