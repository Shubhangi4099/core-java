package com.test.Exception;

public class Arrayindexoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a []= new int[5];
    
     try
     {
    	a[10]=500; 
     }
     //catch(Exception e)
     catch(ArrayIndexOutOfBoundsException e)
     {
//    	 System.out.println(e);
    	 System.out.println(e.getMessage());
     }
	} 

}
