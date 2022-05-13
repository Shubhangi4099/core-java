package com.test.AWTdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionPerfomDemo extends JFrame implements ActionListener {
	JTextField tx1;
    //JTextField tx2;
	JLabel l;
	
     JButton b1;
     ActionPerfomDemo(){
    	 l = new JLabel("enter your name");
    	     tx1 = new  JTextField(20);
    	    // tx2 = new JTextField(20);
    	     b1 = new JButton("ok");
    	     this.add(b1);
    	     this.add(tx1);
    	     this.add(l);
    	    // this.add(tx2);
    	     this.setVisible(true);
    	     this.setLayout(new FlowLayout());
    	     b1.addActionListener(this);
    	     
     }
     @Override
 	public void actionPerformed(ActionEvent e) {
 		// TODO Auto-generated method stub
//    	 String m = JOptionPane.showInputDialog("Anyone there?");
//         System.out.println("welcome"+m);
    	 //veriable delec on string
    	 String name= tx1.getText();
    	 JOptionPane.showMessageDialog(this, "hello"+name,"welcome",JOptionPane.PLAIN_MESSAGE);
    	 
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new ActionPerfomDemo ();
      

	}
	
}
