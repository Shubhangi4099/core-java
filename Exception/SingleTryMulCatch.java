package com.test.Exception;

public class SingleTryMulCatch {

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
         int e []= new int[5];
         e[10]=500; 
    }
    catch(ArithmeticException e) {
    	System.out.println(e.getMessage());
    }
    catch(NullPointerException e) {
 	   System.out.println(e.getMessage());
 	   System.out.println("this String is null");
   }
    catch(ArrayIndexOutOfBoundsException e)
    {
//   	 System.out.println(e);
   	 System.out.println(e.getMessage());
    }
    catch(Exception e) {
    	System.out.println(e); 
    }
    
	}

}
