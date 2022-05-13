package com.test.AWTdemo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class AddMenubar extends JFrame {
	AddMenubar (){
		 JMenuBar mb =  new  JMenuBar();//add menubar
		 setJMenuBar(mb);//set menubar
		 JMenu file = new JMenu("file");
		 JMenu edit = new JMenu("edit");
		 JMenu format= new JMenu("format");
		 
		 mb.add(format);
		 mb.add(edit);
		 mb.add(file);
		 JMenuItem cut = new JMenuItem("cut");
		 JMenuItem copy = new JMenuItem("copy");
		 JMenuItem paste = new JMenuItem("paste");
		 
		 edit.add(cut);
		 edit.add(copy);
		 edit.add(paste);
		 
		 file.add(cut);
		 
		 
		 format.add(paste);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddMenubar m=new AddMenubar (); 
	            m.setVisible(true);
	            m.setSize(400,400);
	}

}
