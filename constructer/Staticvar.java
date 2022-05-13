package com.test.constructer;

public class Staticvar {
         int rollno;
         static String collage="SEED";
         Staticvar(int r){
        	 rollno=r;
        	 System.out.println("roll no ="+r);
         } 
         void DisplayInfo() {
        	 System.out.println("collage name"+collage);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvar st1= new Staticvar (101);
		st1.DisplayInfo();
		Staticvar st2= new Staticvar (102);
		st2.DisplayInfo();
		Staticvar st3= new Staticvar (103);
		st3.DisplayInfo();
		Staticvar st4= new Staticvar (104);
		st4.DisplayInfo();
	}

}
