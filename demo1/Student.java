package demo1;

public class Student {
   int rollno;
   String name;
   float marks1,marks2,marks3,total;
   void getData( int r,String n,float m1,float m2,float m3)//mutater method
   {
	    rollno=r;
	    name = n;
	    marks1=m1;
	    marks2=m2;
	    marks3=m3;
	    		
   } 
   void getDisplay() {
	   System.out.println ("rollno="+rollno);
	   System.out.println("name="+name);
	   System.out.println ("marks1="+marks1);
	   System.out.println ("marks2="+marks2);
	   System.out.println ("marks3="+marks3);
	   
	   
   }
   float calData() { //accerssor method 
	   total =marks1+marks2+marks3;
	   return total;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student ob=new Student();
         ob.getData(1, "shubhangi", 99, 90, 80);
         ob.getDisplay();
         float result =ob.calData();
         System.out.println("total="+result);
	}

}
