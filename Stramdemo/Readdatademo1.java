package com.text.Stramdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readdatademo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream  fin = new FileInputStream("textdemo.txt");
	int i =	fin.read();
	System.out.println((char)i);// to convert the value in char
	fin.close();
	}

}
