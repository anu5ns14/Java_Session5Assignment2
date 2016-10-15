package com.learning.abstraction;

public abstract class Student {
	 protected int rollNumber;
	    protected String name;
	    protected int regNum;
	    protected String result;
	   
	   
	    abstract void getStudentDetails();

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getregNum() {
	        return regNum;
	    }

	    public void setregNum(int regNum) {
	        this.regNum = regNum;
	    }
	   
	    public String getResult() {
	        return result;
	    }

	    public void setResult(String result) {
	        this.result = result;
	    }

}
