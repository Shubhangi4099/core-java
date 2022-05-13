package com.test.AWTdemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tooltipdemo extends JFrame {
      JButton b1;
      Tooltipdemo(){
    	    b1 =new JButton("login");
    	    this.add(b1);
    	     b1.setToolTipText("this is login button");
    	    this.setLayout(new FlowLayout());
    	    this.setVisible(true);
    	    
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new Tooltipdemo();
   
	}

}
