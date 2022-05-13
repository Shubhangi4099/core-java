package com.test.finalmethod;

public class myabstractdemo extends myadstract {

	@Override
	void showdata() {
		// TODO Auto-generated method stub
          System.out.println("this is abstract method delectraction");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myabstractdemo ob= new myabstractdemo();
		ob.showdata();
		ob.mydata();
	}

}
