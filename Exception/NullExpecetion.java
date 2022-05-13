package com.test.Exception;

public class NullExpecetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	String s = null;
        	int a ;
        	a= s.length();
        }
        //catch(Exception e)
        catch(NullPointerException e)
        {
        	//System.out.println(e); for witch exception
        	System.out.println(e.getMessage());
        }
	}

}
