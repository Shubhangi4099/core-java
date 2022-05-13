package com.test.constcterinheritance;
class student
{    int i;
     String name;
	student(int a, String fname)
	{
		i=a;
		name=fname;
	}
	void displayData()
	{
		System.out.println("rollno="+i+"nameis="+name);
	}
}
class Info extends student
{    
	int sport;
	Info(int n1,String s1,int sp)
	{
		super(n1,s1);
		sport=sp; 
	}
	void getshow() {
		System.out.println("sports="+sport);
	}
}
public class parametrisedconinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info ob=new Info(101,"sham",99);
		ob.displayData();
		ob.getshow();
	}

}
