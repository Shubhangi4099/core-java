package com.test.constcterinheritance;
class parent
{
	void display()
	{
		System.out.println("this is parent based class");
	}
}
class child extends parent 
{
	void display()
	{
		System.out.println("this is child deravied class");
	}
	void getdata()
	{
		System.out.println("this is getdata");
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent ob= new child();
		ob.display();
		parent ob1 = new parent();
		ob1.display();
		child ob2= new child();
		ob2.getdata();
	}

}
