package com.test.constcterinheritance;
class a
{
	void display()
	{
		System.out.println("class a");
	}
}
class b
{void display()
{
	System.out.println("class b");
}
}
public class intanceogdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         a om= new a();
         if(om instanceof a) {
        	 System.out.println("yes");
         }
         else {
        	 System.out.println("no");
         }
	}

}
