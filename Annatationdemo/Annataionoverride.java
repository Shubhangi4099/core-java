package com.test.Annatationdemo;
class mybase{
	void showdata() {
		System.out.println("this is base class");
	}
}
class mydrived extends mybase{
	 @Override
	void showdata() {
		
		System.out.println("this is drived class");
	}
}
public class Annataionoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mybase ob = new mybase();
		ob.showdata();
		mybase ob1 = new mydrived();
		ob1.showdata();
	}

}
