package collection;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

	public static void main(String[] args) {

		Integer a[] = { 12, 23, 33, 43, 34, 54, 46 };

		Arrays.sort(a);
		System.out.println("sorting number");
		
		Arrays.sort(a , Collections.reverseOrder());
		
		System.out.println("Modified arr[] : " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("sorting number");
		
		  for(int b:a) 
			   { 
			    System.out.print(b+","); 
			    
			    }
			   
		  System.out.println("Modified arr[] : " + Arrays.toString(a));
		  
		  Integer m[]= {122,343,35,2,4354,6776,90};
		  Arrays.sort(m, Collections.reverseOrder());
		  
		  System.out.println("Modified arr[] : " + Arrays.toString(m));
		 
		  
	}
}
