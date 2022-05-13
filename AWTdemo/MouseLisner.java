package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseLisner extends Frame implements MouseListener {
          Label l; 
          MouseLisner(){
        	  addMouseListener(this);
        	  l = new Label("hello");
        	  this.add(l);
        	  this.setVisible(true);
        	  this.setSize(300,300);
        	  this.setLayout(new FlowLayout());
          }
          
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
          System.out.println(" mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println(" mouse Exited");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new MouseLisner();
	}

}
