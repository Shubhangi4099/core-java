package com.test.AWTdemo;

import java.awt.Button;
import java.awt.Frame;

public class Program2 extends Frame {
	  Button button1;
	  Button button2;
      Program2()
      {
    	  button1 = new Button("login");
    	  button2 = new Button("ok");
    	  button1.setBounds(30, 100, 80, 30);
    	  button2.setBounds(30,150, 80,30);
    	  this.add(button1);
    	  this.setVisible(true);
    	  this.setSize(300,300);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Program2 obj1 =  Program2 (); 
	}
	private static Program2 Program2() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
