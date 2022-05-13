package com.test.constructer;

public class Constructerdemo1 {
         int a;
         int b;
         Constructerdemo1(){ // default constructor
        	 a=20;
        	 b=30;
         } 
         void GetDisply() {
        	 System.out.println("a="+a+"b="+b);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructerdemo1 ob = new Constructerdemo1();
		ob.GetDisply();
	}

}
