package com.test.constcterinheritance;
class superclass
{
	superclass myfun()
	{
		System.out.println("superclass");
		return this;
	}
}
class subclass
{
	subclass myfun() {
		System.out.println("subclass");
		return this;
	}
}
public class coverient { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass tester = new subclass();
				tester.myfun();	
	}

}
