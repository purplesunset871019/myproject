package com.java2.classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FiileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.flush();
			out.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
