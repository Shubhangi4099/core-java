package com.test.constructer;

public class Thiskeywors {
        int a ,b;
        void getData( int a, int b) {
        	 this.a=a;
        	 this.b=b;
        }
        void getDisplay() {
        	System.out.println("a="+a+"b="+b);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeywors ob = new Thiskeywors();
		ob.getData(65,40);
		ob.getDisplay();
	}            

}
