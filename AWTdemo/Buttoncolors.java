package com.test.AWTdemo;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttoncolors extends JFrame {
	JButton b;
	
	Buttoncolors(){
		b =new  JButton("login");
		b.setBackground(Color.red);
		this.add(b);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Buttoncolors();
	}

}
