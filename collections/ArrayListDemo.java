package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList <String> list1= new ArrayList<String>();
           list1.add("c");
           list1.add("cpp");
           list1.add("core java");
           list1.add("python");
           
           Iterator itr =list1.iterator();
           System.out.println("this is my first list");
           while(itr.hasNext()) {
        	   System.out.println(itr.next());
           }
           ArrayList<String> list2 = new ArrayList<String>();
           list2.add("adv java");
           list2.add("spring");
           list2.add("hibenachal");
           Iterator itr2= list2.iterator();
           System.out.println("this is my second list");
           while(itr2.hasNext()) {
        	   System.out.println(itr2.next());
           }
           //adding list1 + list2
           list1.addAll(list2);
           System.out.println("addaing lists");
           Iterator itr3 = list1.iterator();
           while(itr3.hasNext()) {
        	   System.out.println(itr3.next());
           }
           //add perticular postion
           list1.addAll(1,list2);
           Iterator itr4 = list1.iterator();
           System.out.println("add perticular postion");
           while(itr4.hasNext()) {
        	   System.out.println(itr4.next());
           }
           //remove particular postion
           list1.remove(3);
           Iterator itr5 = list1.iterator();
           System.out.println("remove particular postion");
           while(itr5.hasNext()) {
        	   System.out.println(itr5.next());
           }
           //to get function
           System.out.println("get function:"+list1.get(2));
           //remover all list
           list2.clear();
           System.out.println("remover all list:"+list2.isEmpty());
           //insert perticulaer postion alue
           list1.set(1, "shubhu");
           Iterator itr6 = list1.iterator();
           System.out.println("insert perticulaer postion value");
           while(itr6.hasNext()) {
        	   System.out.println(itr6.next());
           }
           
           
	}

}
