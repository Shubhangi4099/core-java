package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListernerevent extends Frame implements KeyListener {
     TextArea tx;
     Label l;
     KeyListernerevent (){
    	
    	  l = new  Label();
    	  l.setBounds(20,50,100,20);
    	  
    	  tx = new  TextArea();
    	  tx.setBounds(20,90,300,300);
    	  tx.addKeyListener(this);
    	  this.add(l);
    	  this.add(tx);
    	  this.setSize(400,400);
    	  this.setVisible(true);
    	  this.setLayout(null);
     }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
         l.setText("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("keyReleased");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new  KeyListernerevent (); 
	}

}
