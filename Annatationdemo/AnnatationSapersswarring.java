package com.test.Annatationdemo;

import java.util.ArrayList;

public class AnnatationSapersswarring {
        @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList list = new ArrayList();
   list.add("c");
   list.add("cpp");
   list.add("core java");
   for (Object o:list) {
	   System.out.println(o);
   }
	}

}
