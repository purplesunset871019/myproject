package myproject.oo;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("王大明",75,88,65);
		/*stu.english = 75;
		stu.math=88;
		stu.chinese=65;*/
		
		int avg=stu.getadverage();
		System.out.println(stu.name +":"+avg);
		
	}

}
