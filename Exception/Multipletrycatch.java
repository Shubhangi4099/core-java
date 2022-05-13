package com.test.Exception;
                     
public class Multipletrycatch {
        public void Display() {
        	int a,b,c;
            a=10;
            b=0;
            c=a/b;
            System.out.println("div="+c); 
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Multipletrycatch  ob = new Multipletrycatch ();
    	  ob.Display();
          
      }
//      catch(Exception e)
//      {
//    	  System.out.println(e);
//      }
      catch(ArithmeticException e) {
    	  System.out.println(e.getMessage()); 
      }
      try {
    	  String s= null;
    	  int a;
    	  a= s.length();
    	  
      }
      catch(NullPointerException e) {
    	   System.out.println(e.getMessage());
      }
      catch(Exception e) {
    	  System.out.println(e.getMessage());
      }
	}

}
