package com.test.AWTdemo;

import java.awt.Button;
import java.awt.Frame;

public class Programe1 extends Frame {
      Button button1;
      Button button2;
      Programe1(){
    	  button1 = new Button("login");
    	  button2 = new Button("ok");
    	  button1.setBounds(30, 100, 80, 30);
    	  button2.setBounds(30,150, 80,30);
    	  this.add(button1);
    	  this.add(button2);
    	  this.setVisible(true);
    	  this.setSize(300,300);
    	  
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Programe1 obj = new  Programe1();
		 
		 
		 }

}
