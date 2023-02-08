package java8;

import java.util.Arrays;

public class ArraysParalleSort {
	
	public static void main(String[] args) {
		int a[]= {12,2,34,22,0,12,2,1};
		
		Arrays.parallelSort(a);
		
		for(int b:a)
		{
			System.out.print(b+",");
		}
	}

}
