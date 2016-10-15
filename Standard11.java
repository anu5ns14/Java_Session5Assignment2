package com.learning.abstraction;

public class Standard11 extends Student {
	public Standard11(int rollNumber,String name,int regNum,String result){
	       
        this.rollNumber = rollNumber;
        this.name = name;
        this.regNum = regNum;
        this.result = result;
    }
   
   
    void getStudentDetails() {
        System.out.println("******************");
        System.out.println("Result of Student having roll no "+rollNumber+ " is:");
        System.out.println("Name : "+name);
        System.out.println("Standard: "+ 11);
        System.out.println("RegNum : "+regNum);
        System.out.println("result : "+result);
       
       
    }
}
