package com.test.AWTdemo;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JframeSwing extends JFrame {
	 JButton button1;
	 JButton button2;
	 JframeSwing() 
	 {
   	  button1 = new JButton("login");
   	  button2 = new JButton("ok");
   	  button1.setBounds(30, 100, 80, 30);
   	  button2.setBounds(30,150, 80,30);
   	  this.add(button1);
   	  this.add(button2);
   	  this.setVisible(true);
   	  this.setSize(300,300);
   	  setLayout(new FlowLayout());//it define how data display in screen
   	  
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JframeSwing obj1 = new JframeSwing();
	}

}
