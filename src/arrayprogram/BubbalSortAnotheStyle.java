package arrayprogram;

import java.util.Arrays;

public class BubbalSortAnotheStyle {
	public static void main(String[] args) {
		int a[]= {12,34,56,78,12,3,1,2,2};
		int temp=0;
		System.out.println("After Print bubbal sort"+Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("befor print bubbal sort"+Arrays.toString(a));
	}

}
