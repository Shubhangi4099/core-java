package com.test.Exception;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          
          try {
        	  int a,b,c;
              a=10;
              b=0;
              c=a/b;
              System.out.println("div="+c);
              String s =null;
              int l;
              l=s.length();
          }
          catch(ArithmeticException e) 
          {
        	  System.out.println(e.getMessage());
          }
          catch(Exception e) 
          {
        	  System.out.println(e);
          }
          
         
	}         
          
}


