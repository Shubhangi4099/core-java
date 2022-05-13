package com.text.Stramdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    String msg = "HELLO ALL";
    byte data[]= msg.getBytes();
    //it encods the string of bytes & return the array of thous bytes
    FileOutputStream tout = new   FileOutputStream("textdemo2.txt");
    tout.write(data);
    tout.close();
	}

}
