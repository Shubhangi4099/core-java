package com.test.constructer;

public class Overlodingconstructor {
	int p,s,t;
	 Overlodingconstructor()
	 {
		 p=20;
		 System.out.println("p="+p);
	 }
	 Overlodingconstructor(int q, int r)
	 {
		 s=q;
		 t=r;
		 
		 
		// System.out.println("q="+q+"r="+r);
	 } 
	 void display() {
		 System.out.println("q="+s+"r="+t);
		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overlodingconstructor ob= new Overlodingconstructor(12,65);
		 ob.display();
		 Overlodingconstructor ob1= new Overlodingconstructor(2,5);
		 ob1.display();
		 Overlodingconstructor ob2= new Overlodingconstructor();
		 ob2.display();
	}

}
