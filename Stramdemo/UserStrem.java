package com.text.Stramdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UserStrem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  String msg;
		 System.out.println("Enter some value:");
         Scanner sc = new Scanner(System.in);
        msg= sc.nextLine();
        byte data[]= msg.getBytes();
        //it encods the string of bytes & return the array of thous bytes
        FileOutputStream tout = new   FileOutputStream("textdemo3.txt");
        tout.write(data);
        tout.close();
         
	}

}
