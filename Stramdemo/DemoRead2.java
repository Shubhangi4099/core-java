package com.text.Stramdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileInputStream finp = new FileInputStream ("textdemo2.txt");
     int i = 0 ;
         while( (i = finp.read())!=-1) {
        	 System.out.print((char)i);
         }
	}

}
