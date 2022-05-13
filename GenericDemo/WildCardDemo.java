package GenericDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildCardDemo {
    public static void Display(List ? list) {
    	for (object o:list) {
    		System.out.println(o);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> li = Arrays.asList(1,2,3,4);
     
	}

}
