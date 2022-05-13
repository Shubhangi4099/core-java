package com.test.constructer;

public class Stacticveriable {
       int id;
       static String orgname="SEED";
       Stacticveriable(int i){
    	 id=i;
    	 
    	 }
       void DisplayInfo()
       {
    	   System.out.println("organazation name="+orgname);
    	   System.out.println("id="+id);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stacticveriable std1=new  Stacticveriable(101);
		 std1.DisplayInfo();
		 Stacticveriable std2=new  Stacticveriable(102);
		 std2.DisplayInfo();
		 Stacticveriable std3=new  Stacticveriable(103);
		 std3.DisplayInfo();
		 Stacticveriable std4=new  Stacticveriable(104);
		 std4.DisplayInfo();
		 Stacticveriable std5=new  Stacticveriable(105);
		 std5.DisplayInfo();
		
		 System.out.println("new value");
		 Stacticveriable .orgname="SEED INFOTECH";
		 std1.DisplayInfo();
		 std2.DisplayInfo();
		 std3.DisplayInfo();
		 std4.DisplayInfo();
		 std5.DisplayInfo();
	}

}
