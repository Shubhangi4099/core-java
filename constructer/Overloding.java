package com.test.constructer;

public class Overloding {
          void Display( int a, int b)
          {
        	  
        	    System.out.println("a="+a+"b="+b);
          }
          void Display( int p, float q)
          {
        	    
        	    System.out.println("p="+p+"q ="+q);
          }
          void Display( int c, float d,int e)
          {  
        	  
        	    System.out.println("c="+c+"d="+d+"e="+e);
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloding obj= new Overloding();
		obj.Display(11, 50);
		obj.Display(56, 20.0f);
		obj.Display(98, 456.5f, 450);
		
	}

}
