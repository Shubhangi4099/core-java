package com.test.constructer;

public class parameterrized {
	int a,b;
	parameterrized(int m,int n)// parameterized constructor
	{
		 a=m;
		 b=n;
	}
        void getDisplay() {
        	System.out.println("m="+a+"n="+b);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterrized ob=new parameterrized(30,34);
	         ob.getDisplay();
	}

} 
