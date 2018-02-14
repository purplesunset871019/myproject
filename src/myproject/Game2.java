//(1)5*3長方形格子，按2往下，按4往左，按6往右，按8往上，到邊界按不能繼續前進
//(2)原本血量100，每動一步，扣五滴血
//到最右下角時輸出finish
//血量為零時輸出game over
package myproject;

import java.util.Scanner;

public class Game2 {

		public static void main(String[] args) {

			int a;
		    int hp=100;
		    int pos=0;
		    int row=3;
		    int column=5;
		    	    
			System.out.println("hp"+"="+hp);     
			
			for(a=1;;a++)
			{
			    Scanner scanner = new Scanner(System.in);
			    String Line = scanner.nextLine();
			    int number = Integer.parseInt(Line);	
			   
			    //下
			    if((pos/column) < (row-1))
				{
					switch(number)
					{
					case 2:
						pos=pos+column;
						hp=hp-5;
						System.out.println("hp"+"="+hp);
						System.out.println("所在位置"+" "+pos);
						break;
					}
				}
			
			    //上
			    if((pos/column) > 0)
				{
					switch(number)
					{
					case 8:
						pos=pos-column;
						hp=hp-5;
						System.out.println("hp"+"="+hp);
						System.out.println("所在位置"+" "+pos);
						break;
					}
				}
			    
			    //左
			    if(pos % 5 != 0)
				{
					switch(number)
					{
					case 4:
						pos=pos-1;
						hp=hp-5;
						System.out.println("hp"+"="+hp);
						System.out.println("所在位置"+" "+pos);
						break;
					}
				}
					    
			    //右
			    if((pos+1) % 5 != 0)
				{
					switch(number)
					{
					case 6:
						pos=pos+1;
						hp=hp-5;
						System.out.println("hp"+"="+hp);
						System.out.println("所在位置"+" "+pos);
						break;
					}
				}
			    
			    if(pos==14)
			    {
			    	System.out.print("finish");
			    	break;
			    }
			    
			    if(hp==0)
			    {
			    	System.out.print("game over");
			    	break;
			    }
			}
			
			
		}
	}

