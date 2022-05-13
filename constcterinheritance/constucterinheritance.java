package com.test.constcterinheritance;
class demo
{
	demo()
	{
		System.out.println("this is contraoter in based class");
	}
	void display() {
		System.out.println("this is diaplay in based class");
	}
	}
class myDrive extends demo
{
	myDrive()
	{
		super();
		System.out.println("this is drived class constocter");
	}
	void displayinfo()
	{
		System.out.println("this is displayinfo in drived class");
	}
}
public class constucterinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myDrive ob= new myDrive();
       ob.display();
       ob.displayinfo();
	}

}
