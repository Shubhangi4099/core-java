package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Rediobutton extends JFrame implements ActionListener {
    JRadioButton r1,r2;
    Rediobutton(){
    	r1 = new  JRadioButton ("male");
    	r2 =new  JRadioButton ("female");
    	ButtonGroup obj= new ButtonGroup();
    	obj.add(r1);
    	obj.add(r2);
    	this.add(r1);
    	this.add(r2);
    	this.setVisible(true);
    	this.setLayout(new FlowLayout());
    	r1.addActionListener(this);
    	r2.addActionListener(this);
    }
    @Override
	public void actionPerformed(ActionEvent e) {
    	
		// TODO Auto-generated method stub
    	 if(r1.isSelected()) {
    		 //joptionpane: is used to diplay mesg on screen
    		 JOptionPane.showMessageDialog(r1, "you are male");
    	 }
    	 if(r2.isSelected()) {
    		 JOptionPane.showMessageDialog(r2, "you are female");
    	 }
    	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Rediobutton ();
	}

	

}
