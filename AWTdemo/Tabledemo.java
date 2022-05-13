package com.test.AWTdemo;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Tabledemo extends JFrame {
	
	Tabledemo(){
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		String[] col = {"name","subject","marks"};
		Object[][] data= {{"name","subject","marks"},
				{"shubhu","java","98"},
				{"shital","cpp","97"},
				{"payal","advance java","98"}
				};
		JTable tb = new JTable(data,col);
		this.add(tb);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Tabledemo();
	}

}
