package com.test.inheritance;
  class Student{
	  int rollno;
	  String name;
	  void getData(int r, String s) {
		  rollno=r;
		  name=s;
		  System.out.println("rollno="+rollno+"name="+name);
	  }
	  
  }
  class marks extends Student{
	  int m1,m2,m3,total;
	  void getInfo(int s1, int s2,int s3) {
		  m1=s1;
		  m2=s2;
		  m3=s3;
		  total=m1+m2+m3;
	  }
	  void DisplayInfo() {
		  System.out.println("marks1="+m1+"marks2="+m2+"marks3="+m3);
		  System.out.println("total="+total);
	  }
	  
  }
  class Finalresult extends marks{
	  float avg;
	  int spmarks,finalmarks;
	  
	  void Infodata(int spmarks ) {
		 this. spmarks= spmarks;
		 System.out.println( "sports marks"+spmarks);
	  }
	  void data() {
		  finalmarks=total+ spmarks;
		  avg= finalmarks/4;
		  System.out.println("final marks="+finalmarks);
		  System.out.println("avrage of marks="+avg);
	  }
  }
public class Multileveinhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalresult ob=new Finalresult();
		ob.getData(101, "shubahngi");
		ob.getInfo(80, 80, 90);
		ob.DisplayInfo();
		ob.Infodata(89);
		ob.data();

	}

}
