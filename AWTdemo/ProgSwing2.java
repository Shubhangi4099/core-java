package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgSwing2 extends JFrame implements ActionListener {
       JLabel l1,l2;
        JTextField tx1;
	     JTextField tx2;
       JButton b1;
       ProgSwing2(){
    	   l1 = new JLabel  ("username");
    	   l2= new JLabel("password");
    	   tx1 = new JTextField(10);
    	   tx2 = new JTextField(10);
    	   b1 = new  JButton("login");
    	   
    	   this.add(b1);
    	   b1.addActionListener(this);//its calls actionperfromed
    	   
    	   this.add(l1);
    	   this.add(l2);
    	   this.add(tx1);
    	   this.add(tx2);
    	   
    	   this.setVisible(true);
    	  this.setLayout(new FlowLayout());
    	   
       }
       
       @Override
   	public void actionPerformed(ActionEvent ae) {
   		// TODO Auto-generated method stub
   		 String nume=tx1.getText();
   	        String pass=tx2.getText();
   	        System.out.println("username:"+nume+"\t"+"passworsd"+pass);
   	        if(nume.equals("admin")&&(pass.equals("admin"))) {
   	        	System.out.println("welcome to the page");
   	        }
   	        else {
   	        	System.out.println("username and password is incorrect");
   	        }
   	        
   		}
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       

	}
	

	}


