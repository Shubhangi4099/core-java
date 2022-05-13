package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swingjframe1 extends JFrame implements ActionListener{
        JLabel l1;
        JButton b1,b2;
        Swingjframe1(){
        	l1 = new JLabel();
        	b1 = new JButton ("hello");
        	b2 = new JButton("bye");
        	this.add(b1);
        	this.add(b2);
        	this.add(l1);
        	this.setVisible(true);
        	this.setLayout(new FlowLayout());
        	b1.addActionListener(this);
        	b2.addActionListener(this);
        }
        @Override
    	public void actionPerformed(ActionEvent ae) {
    		// TODO Auto-generated method stub
    		 if(ae.getSource()==b1) {
    			l1.setText("hello");
    		 }
    		 else {
    			l1.setText("bye");
    		 }
    	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Swingjframe1();
	}

	

}
