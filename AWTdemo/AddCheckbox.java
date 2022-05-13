package com.test.AWTdemo;

import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class AddCheckbox extends JFrame {
       Checkbox b;
       Checkbox b1;
       AddCheckbox (){
    	   b= new Checkbox("c");
    	   b1 = new Checkbox("cpp");
    	   this.add(b);
    	   this.add(b1);
    	   this.setVisible(true);
    	   this.setLayout(new FlowLayout());
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new AddCheckbox ();
	} 

}
