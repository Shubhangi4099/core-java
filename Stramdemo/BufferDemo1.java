package com.text.Stramdemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileOutputStream fout = new   FileOutputStream("textbuffer.txt");
         BufferedOutputStream bout = new  BufferedOutputStream(fout);
         String msg = "seet infotech";
             byte data1[] =msg.getBytes();
             bout.write(data1);
             bout.close();
             fout.close();
         
	}
}
