package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionpaneDemo extends JFrame implements ActionListener{
	 JButton b1;
	 
	 OptionpaneDemo(){
		  b1 = new JButton ("ok");
		  this.add(b1);
		  this.setVisible(true);
		  this.setLayout(new FlowLayout());
		  b1.addActionListener(this);
	 }
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		 JOptionPane.showMessageDialog(this, "hello all", "mytitle",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(this, "information messgae","tital impformatioon msg", JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(this, "question msg","tital queston",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this, "error msg","error title",JOptionPane.ERROR_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new  OptionpaneDemo();
	}


}
