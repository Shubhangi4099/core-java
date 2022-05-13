package com.text.Stramdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream fin = new   FileInputStream("textbuffer.txt");
		   BufferedInputStream bin = new  BufferedInputStream(fin);
		   
		   int i=0;
		   while((i = bin.read())!=-1)
		   {
			   System.out.print((char)i);
		   }
		   
	}

}
