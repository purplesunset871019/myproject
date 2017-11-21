package myproject;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");     
	    Scanner scanner = new Scanner(System.in);
	    String Line = scanner.nextLine();
	    int number = Integer.parseInt(Line);	
	    
		switch (number) {
		case 1:
			System.out.print("星期一");  
			break;
		case 2:
			System.out.print("星期二");  
			break;
		case 3:
			System.out.print("星期三");  
			break;
		case 4:
			System.out.print("星期四");  
			break;
		case 5:
			System.out.print("星期五");  
			break;
		case 6:
			System.out.print("星期六");  
			break;
		case 7:
			System.out.print("星期日");  
			break;
	    default:
			System.out.print("資料錯誤");  
		}
}
}
