package assingment;

public class PerfectCheckSquare {
	//user defined mehod  
	public static boolean checkPerfectSquare(int number)  
	{  
	//comparing the number with 0 and 1  
	//returns true if any one condign is true because 0 and 1 are perfect square   
	if(number==0||number==1)  
	return true;  
	for (int i=0; i<=number/2; i++)   
	{  
	//for each iteration of i calculating the square      
	int x=i*i;  
	//the number is perfect square if x is equal to number  
	if(x==number)  
	return true;  
	//the number cannot be perfect square if number<x  
	else if (number<x)  
	return false;  
	else  
	continue;  
	}  
	return false;  
	}  
	public static void main(String[] args) {
		// TODO Auto-gener{  
		int number=50;  
		//calling the method and prints the result accordingly  
		System.out.println(number + " is a perfect square number? " + checkPerfectSquare(number));  
		number=361;  
		System.out.println(number + " is a perfect square number? " + checkPerfectSquare(number));  
		} 
         
	}


