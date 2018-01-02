package myproject.oo;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("王大明",75,88,65);
		Student stu2=new Student("黃大維",77,99,40);
		
		stu1.pass=50;
		stu1.print();
		stu2.print();
			
		int avg=stu1.getadverage();
		System.out.println(stu1.name +":"+avg);
		Student.method();
		GraduateStudent gstu=new GraduateStudent();
		gstu.print();
	}

}
