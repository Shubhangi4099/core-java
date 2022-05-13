package demo1;

public class Student1 {
            int a;
	         public int getA() {
				return a;
			}
			public void setA(int a) {
				this.a = a;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			String name;
			void getDisplay() {
				System.out.println("a="+a);
				System.out.println("name="+name);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 ob= new Student1();
		ob.setA(55);
		ob.setName("shubhu");
		ob.getDisplay();
		
	}

}
