package myproject.oo;

public class Student {

		/*private*/public int english;
		protected int math;
		int chinese;
		String name;
		static int pass=60;
		public Student(){
			
		}
		
		public Student(String n,int e,int m,int c)
		{
			this.name=n;
			this.english=e;
			this.math=m;
			this.chinese=c;
		}
		
		public Student(String name)
		{
		this.name =name;
		}
		
		public static void method(){
			System.out.println("hello");
		}
		
		public void print()
		{
			System.out.println(pass);
			System.out.println(english+"\t"
					+math+"\t"+chinese);
		}
		
		public int getadverage()
		{
			return (english+math+chinese)/3;
		}
	}

