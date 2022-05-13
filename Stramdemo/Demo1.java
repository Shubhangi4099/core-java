package com.text.Stramdemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
        FileOutputStream tout = new   FileOutputStream("textdemo.txt");
        //write data to file
        tout.write(69);
        tout.close();
	}

}
