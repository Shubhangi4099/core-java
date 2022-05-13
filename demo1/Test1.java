package demo1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // LOOPING STATEMENT 
		// two types of looping statement 
		//while loop
		
		int x= 1;
		while(x<=10) {
			System.out.println(x*2);
			x++;
		}
		
		
		
		//for loop
		for(int i = 0; i <=10;i++) {
			System.out.println(i);
		}
		
		
		
		// nested for loop
		int n=5;
		
		for(int i=0;i<5;i++) { 
			
			for(int j=0;j<=i;j++) {
				
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
