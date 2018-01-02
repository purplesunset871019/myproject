package myproject.oo;

public class GraduateStudent extends Student {
	
	int thesis;
     public GraduateStudent() {
    	 super();
    	 System.out.println("haha");
	}
     @Override
     public void print(){
    	 super.print();
    	 System.out.println(pass);
		 System.out.println(english+"\t"
				+math+"\t"+chinese); 
     }
     @Override
		public int getadverage()
		{
			return (english+math+chinese)/3;
		}

}
