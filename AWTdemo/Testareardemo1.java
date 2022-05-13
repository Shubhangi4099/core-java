package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class Testareardemo1 extends Frame {
           TextArea t;
           Testareardemo1(){
        	   t = new TextArea();
        	   this.add(t);
        	   this.setVisible(true);
        	   this.setLayout(new FlowLayout());
           }
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new  Testareardemo1();
	}

}
