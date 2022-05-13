package com.test.constcterinheritance;
class MSRT
{      String name;
	   int amt;
        int seat;
        void mybook(int a,int s, String n)
	{
		amt=a;
		seat=s;
		name=n;
		int bill =200*15;
		if (bill>1000) {
			int dis=(bill*15)/100;
			int total = bill-dis;
			int total1 = bill;
			System.out.println("congratulations you have discout "+dis);
		}
		else {
			System.out.println("your total bill is "+bill);
		}
	}
        void display() {
        	System.out.println("amount is="+amt+"seats is="+seat+"your name="+name+"\n"+"your total is");
        }
        
}
class RedBus extends MSRT
{    
	void mybook(int a , int s,String n)
	{
		int bill=500*2;
		if(bill>2000)
		{
		  int dis=(bill*10)/100;
		  int total = bill-dis;
			System.out.println("congratulations you have discout "+dis);
		}
		else {
			System.out.println("your total bill is "+bill);
		}
			  
		  
			
		}
	 void display() {
     	System.out.println("amount is="+amt+"seats is="+seat+"your name="+name);
     }
	}

class OnlineMSRT extends MSRT
{
	void mybook(int a , int s,String n)
	{
		int bill =500*15;
		if (bill>900) {
			int dis=(bill*15)/100;
			int total = bill-dis;
			System.out.println("congratulations you have discout "+dis);
		}
		else {
			System.out.println("your total bill is "+bill);
		}
	}
	 void display() {
     	System.out.println("amount is="+amt+"seats is="+seat+"your name="+name);
     }
}
class Yatradotcom extends MSRT
{
	void mybook(int a , int s,String n)
	{
		int bill =800*15;
		if (bill>1000) {
			int dis=(bill*15)/100;
			int total = bill-dis;
			System.out.println("congratulations you have discout "+dis);
		}
		else {
			System.out.println("your total bill is "+bill);
		}
	}
	 void display() {
     	System.out.println("amount is="+amt+"seats is="+seat+"your name="+name);
     }
}
public class methodoverringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSRT ob= new MSRT();
		ob.mybook(9,8,"sham");
		ob.display();
		MSRT ob1= new  RedBus();
		ob1.mybook(10, 20, "shubhu");
		ob1.display();
		MSRT ob2 = new OnlineMSRT();
		MSRT ob3 = new  Yatradotcom();

	}

}
