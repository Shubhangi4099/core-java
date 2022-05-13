package com.test.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Qequedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Deque<String> deq= new ArrayDeque<String>();
      deq.add("c");
      deq.add("cpp");
      deq.add("cor java");
      deq.add("c+++");
      deq.add("c#");
      deq.add("python");
      deq.add("ruby");
      deq.add("golang");
      //traversv elements
      System.out.println("elements are:");
     for(String str:deq){
            System.out.println(str);
     }
    //remove higest priority ele
     deq.poll();
     //iterator it using ele
     System.out.println("after remove priorty element");
     Iterator<String> itr= deq.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     //remove last poll 
     System.out.println("after remove poll_last element");
     deq.pollLast();
     for(String str:deq){
         System.out.println(str);
  }
     System.out.println("after offer or add element");
     deq.offer("SEED");
     for(String str:deq){
         System.out.println(str);
  }
     System.out.println("after first offer or add element");
     deq.offerFirst("SEED1");
     for(String str:deq){
         System.out.println(str);
  }
     
     
	}}
