package arrayprogram;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPrint {
	public static void main(String[] args) {
		
		 int a[]= {50,30,10,20,30,40};
		 System.out.println("print array in before sort"+ Arrays.toString(a));
		 Arrays.parallelSort(a);
		 System.out.println("print after sorting"+Arrays.toString(a));
		 
		 //another approch in define array
		 
		
		 int b[]= {40,80,50,30,10,20,30,40,40,60};
		 System.out.println("print array in before sort"+ Arrays.toString(b));
		 Arrays.sort(b);
		 System.out.println("print after sorting "+Arrays.toString(b));
		 
		 //revers order to print value 
		 
		 Integer c[]= {40,80,50,30,10,20,30,40,40,60};
		 System.out.println("print array in before sort"+ Arrays.toString(c));
		 Arrays.sort(c,Collections.reverseOrder());
		 System.out.println("print after sorting "+Arrays.toString(c));
	}

}
