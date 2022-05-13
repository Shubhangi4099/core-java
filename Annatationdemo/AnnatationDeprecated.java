package com.test.Annatationdemo;
class basecl{
	void display() {
		System.out.println("this is base class");
	}
	@Deprecated
	void mydisplay() {
		System.out.println("this is deriver classs");
	}
}

public class AnnatationDeprecated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basecl ob = new basecl();
		ob.display();
		ob.mydisplay();
	}

}
