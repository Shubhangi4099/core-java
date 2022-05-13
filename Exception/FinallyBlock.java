package com.test.Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int data=25/0;
    	   System.out.println(data);
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
       finally {
    	   System.out.println("Finally block always excuteded");
    	  
       }
	}

}
