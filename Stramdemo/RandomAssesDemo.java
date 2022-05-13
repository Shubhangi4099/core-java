package com.text.Stramdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAssesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File f1 = new File("textdemo2.txt");
     File f2 = new File ("textbuffer.txt");
     RandomAccessFile raf1 = new  RandomAccessFile(f1,"r");
     RandomAccessFile raf2 = new  RandomAccessFile(f2,"rw");
     int x=0;
     System.out.println("this is the position:"+raf1.getFilePointer());
     raf1.seek(3);//to go on perticuler position
     System.out.println("after poostion of pointer:"+raf2.getFilePointer());
     do {
    	 x=raf1.read();
    	 raf2.write((char)x);
     }
     while(x!=-1);
    	           
     
     
	}

}
