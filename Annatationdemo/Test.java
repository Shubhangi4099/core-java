package com.test.Annatationdemo;

import java.lang.reflect.Method;

public class Test {
	@Myannotation(devloperName="shivangi",expirydate="03-04-2022")
     public void mymethod1() {
    	 System.out.println("this is mymethod1...");
     }
	@Myannotation(devloperName="shivani",expirydate="30-04-2022")
     public void mymethod2() {
    	 System.out.println("this is mymethod2...");
     }
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
        Method method=new Test().getClass().getMethod("mymethod1");
        Myannotation annotation =method.getAnnotation(Myannotation.class); 
        System.out.println(annotation.devloperName()+"\t"+annotation.expirydate());
        //second method
        Method method1=new Test().getClass().getMethod("mymethod2");
        Myannotation annotation1 =method1.getAnnotation(Myannotation.class); 
        System.out.println(annotation1.devloperName()+"\t"+annotation1.expirydate());
	}

}
