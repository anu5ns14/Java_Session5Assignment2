package com.learning.abstraction;

public class MainClass {
		   
	    public static void main(String[] args) {
	       
	        Standard10 stud1 = new Standard10(1,"Abhimanyu",0152,"Pass");
	        stud1.getStudentDetails();
	       
	        Standard10 stud2 = new Standard10(2,"Sandy",0154,"Pass");
	        stud2.getStudentDetails();
	       
	        Standard10 stud3 = new Standard10(3,"Amit",0155,"Pass");
	        stud3.getStudentDetails();
	       
	        Standard10 stud4 = new Standard10(4,"Shruti",0157,"Fail");
	        stud4.getStudentDetails();
	       
	        Standard10 stud5 = new Standard10(5,"Abhi",0160,"Pass");
	        stud5.getStudentDetails();
	       
	       
	        Standard11 st1 = new Standard11(1,"Rohit",0142,"Pass");
	        st1.getStudentDetails();
	       
	        Standard11 st2 = new Standard11(2,"Surbhi",0143,"Pass");
	        st2.getStudentDetails();
	       
	        Standard11 st3 = new Standard11(3,"Ramesh",0144,"Pass");
	        st3.getStudentDetails();
	       
	        Standard11 st4 = new Standard11(4,"Priyam",0145,"Pass");
	        st4.getStudentDetails();
	       
	        Standard11 st5 = new Standard11(5,"Ram",0146,"Pass");
	        st5.getStudentDetails();
	       
	       
	        Standard12 s1 = new Standard12(1,"Suhas",0132,"Pass");
	        s1.getStudentDetails();
	       
	        Standard12 s2 = new Standard12(2,"Ajay",0133,"Pass");
	        s2.getStudentDetails();
	       
	        Standard12 s3 = new Standard12(3,"Maninder",0134,"Fail");
	        s3.getStudentDetails();
	       
	        Standard12 s4 = new Standard12(4,"Navi",0135,"Pass");
	        s4.getStudentDetails();
	       
	        Standard12 s5 = new Standard12(5,"Raj",0136,"Pass");
	        s5.getStudentDetails();
	    }
}
