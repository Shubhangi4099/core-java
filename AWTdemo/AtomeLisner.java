package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AtomeLisner extends JFrame implements ItemListener {
        JCheckBox box1;
        JCheckBox box2;
        JLabel l1;
        AtomeLisner (){
        	box1= new  JCheckBox("c++");
        	box2 = new JCheckBox("java");
        	l1 = new JLabel();
        	this.add(box1);
        	this.add(box2);
        	this.add(l1);
        	this.setVisible(true);
        	this.setLayout(new FlowLayout());
        	box1.addItemListener(this);
}
        
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
	if(e==box1) {
		l1.setText("c++ selected");
	}
	else {
		l1.setText("java selsected");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new  AtomeLisner();
	}

	
}
