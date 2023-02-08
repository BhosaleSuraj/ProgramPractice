package newPractice;

import java.util.Arrays;

public class JagadArrayExampe {
	public static void main(String[] args) {
		

	
		int[][] jaggedArray = new int[3][];
		jaggedArray[0] = new int[]{0,1,2,3};
		jaggedArray[1] = new int[]{4,5};
		jaggedArray[2] = new int[]{6,7,8};
 
		for(int[] row : jaggedArray){
			System.out.println(Arrays.toString(row));
		}

}

}