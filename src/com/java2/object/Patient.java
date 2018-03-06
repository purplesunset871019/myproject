package com.java2.object;

public class Patient{
	
	 String Patientname;
	 String IDcardnumber;
	 String sex;
	 int weight;
	 int height;
		
	public Patient(String Patientname,String IDcardnumber,String sex,int weight,int height)
	 {
		 this.Patientname=Patientname;
		 this.IDcardnumber=IDcardnumber;
		 this.sex=sex;
		 this.weight=weight;
		 this.height=height;
	 }
	 public void PatientIdentity()
	 {
		 System.out.println("病人資料");
		 System.out.println("名字："+Patientname+"	"+"身分證字號："+IDcardnumber);
		 System.out.println("性別："+sex+"	"+"體重："+weight+"kg"+"	"+"身高："+height+"cm");
	 }
}
