package com.test.cloning;

public class Complex implements Cloneable {
	int m_reg;
	int m_img;
	public Complex(int r, int i){
		m_reg =r;
		m_img =i;
	}
	void getdisplay() {
		System.out.println("mreg r="+m_reg+"m_img i="+m_img);
	}
	public Object clone() {
		Complex temp= new Complex(this.m_img, this.m_reg);
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class value");
		Complex ob1 = new Complex(10,50);
		ob1.getdisplay();
		System.out.println("clone value");
		Complex ob2 = (Complex) ob1.clone();
		ob2.getdisplay();
	}

}
