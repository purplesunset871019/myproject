package com.java2.classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import myproject.sogo.Customer;
import myproject.sogo.GoldCustomer;
import myproject.sogo.SilverCustomer;

public class Sogo 
{
	Scanner scanner=new Scanner(System.in);
	public Sogo()
	{

	}
	
	public void start()
	{

		/*//System.out.println("請輸入功能(1~3):");
		int funtion = scanner.nextInt();
		switch(funtion){
		case 3:
			return;*/
		
		int function = 0;
		while(function !=3)
		{
			showFunctions();
			function = scanner.nextInt();
			switch(function)
			{
			case 1:
				inputSales();
				break;
			case 2:
				try
				{
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while(line != null)
					{
						int
					}
				}
			}
			
		}
	}
	
	public void showFunctions(){
		System.out.println("請輸入功能(1~3)");
		System.out.println("1) 輸入銷售紀錄");
		System.out.println("2) 輸出銷售報表");
		System.out.println("3) 結束程式");
	}
	
	public static void main(String[] args){
		Sogo sogo = new Sogo();
		sogo.start();
	}
	
}
