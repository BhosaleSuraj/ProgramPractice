package arrayprogram;

import java.util.ArrayList;

public class FindAThreeSortedArrayToCommanNumber {
	public static void main(String[] args) {
	{
		
		int A,B,C;
		
	  
		
		ArrayList <Integer> comman=new ArrayList<Integer>();
		
		int a[]= {1,2,3,5,6,787,90};
		int b[]= {3,4,5,6,73,22,9};
		int c[]= {56,7,5,6,89,9};
		
		int X=0,Y=0,Z=0;
		
		while(X < a.length && Y < b.length && Z < c.length )
		{
			if(a[X] == b[Y] && b[Y] == c[Z])
			{
				comman.add(a[X]);
				X++;
				Y++;
				Z++;
			}
			else if(a[X] < b[Y])
				X++;
			else if( b[Y] < c[Z])
				Y++;
			else
				Z++;	
		}
		System.out.println(comman);
		
	
	
		ArrayList<Integer> common = new ArrayList<Integer>();
		   int array1[] = {2, 4, 8};
		   int array2[] = {2, 3, 4, 8, 10, 16};
		   int array3[] = {4, 8, 14, 40};
			int x = 0, y = 0, z = 0;
			while (x < array1.length && y < array2.length && z < array3.length)
			{
				if (array1[x] == array2[y] && array2[y] == array3[z])
				{
					common.add(array1[x]);
					x++;
					y++;
					z++;
				}
				else if (array1[x] < array2[y])
					x++;
				else if (array2[y] < array3[z])
					y++;
				else
					z++;
			}
			
			int Integer =3;
			char String='s';
			System.out.println(Integer+" "+String);
			System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
		System.out.println(common);
		
}}
}

