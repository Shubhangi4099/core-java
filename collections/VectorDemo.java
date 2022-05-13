package com.test.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<String> obj= new Vector<String>();
       obj.add("c");
       obj.add("cpp");
       obj.add("core java");
       obj.add("advan java");
       obj.add("c lang");
       
       Iterator itr = obj.iterator();
       while (itr.hasNext())
    		   {
    	   System.out.println(itr.next());
       }
       //check size and capacity
       System.out.println("sixe is:"+obj.size());
       System.out.println("capacity is :"+obj.capacity());
       //checking ele is perent or not
       if(obj.contains("cpp"))
       {
    	   System.out.println("cpp is persent "+obj.indexOf("cpp"));
       }
       else {
    	   System.out.println("not present");
       }
       //get first ele
       System.out.println("get firdt elemrnt:"+obj.get(0));
       System.out.println("get firdt elemrnt:"+obj.get(3));
       //removrparticular element
       System.out.println("removr ele:"+obj.remove("cpp"));
       
       
       
	}

}
