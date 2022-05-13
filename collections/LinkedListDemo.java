package com.test.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<String> obj= new LinkedList<String>();
          obj.add("neha");
          obj.add("shubhu");
          obj.add("shital");
          System.out.println("first list:------------------------------------------");
          Iterator <String> itr = obj.iterator();
          while(itr.hasNext())
          {
        	  System.out.println(itr.next());
          }
          List<String> obj2= new LinkedList<String>();
          obj2.add("SEED");
          obj2.add("INFOTECH");
          obj2.add("PUNE");
          System.out.println("second list:-----------------------------------------------");
          Iterator <String> itr1 = obj2.iterator();
          while(itr1.hasNext())
          {
        	  System.out.println(itr1.next());
          }
          //adding list1 & list2
          obj.addAll(obj2);
          System.out.println("adding list1 & list2:-----------------------------------------");
          Iterator <String> itr2 =obj.iterator();
          while(itr2.hasNext()) {
        	  System.out.println(itr2.next());
          }
          //adding  element perticular postion
          //obj.add(2, "ganbas");
          obj.set(2, "seed");
          System.out.println("adding  element perticular postion:------------------------");
          Iterator <String> itr3 = obj2.iterator();
          while(itr3.hasNext())
          {
        	  System.out.println(itr3.next());
          }
        
	}

	

}
