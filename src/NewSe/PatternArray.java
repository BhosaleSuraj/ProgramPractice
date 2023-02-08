package NewSe;

import java.util.Arrays;
import java.util.Scanner;

public class PatternArray {
	public static void main(String[] args) {
		
		
		  Scanner sc=new Scanner(System.in);
		  
		  //first array give user through 
		  System.out.print("enter first array"); 
		  int c=sc.nextInt(); 
		  int d=0; 
		  int a[]= new int[c]; 
		  int b[]=new int[c]; 
		  
		  for(int i=0;i<=a.length-1;i++) 
		  { 
			  a[i]=sc.nextInt(); 
			  b[d++]=a[i]; 
		  } 
		  // int p=a.length;
		  // System.out.println("first aray"+Arrays.toString(b));
		  
		  
		  //second array give user through
		  
		  System.out.print("enter second array"); 
		  int g= sc.nextInt(); 
		  int h=0; 
		  int l[]= new int[g]; 
		  int k[]=new int[g]; 
		  for(int j=0;j<=a.length-1;j++) 
		  {
			  a[j]=sc.nextInt();
			  k[h++]=a[j];
		  } 
		  // int p=a.length;
		  System.out.println("first aray"+Arrays.toString(b));
		  System.out.println("second aray"+Arrays.toString(k));
		 
		
			/*
			 * int b[] = {1,2,3,4}; int k[] = {5,6,7,8};
			 */
		  System.out.print("comman number of array:");
		  for(int i=0;i<b.length;i++)
		  {
			  for(int j=0;j<k.length;j++)
			  {
				  if(b[i]==k[j])
				  {  
					  System.out.print(b[i]+",");
					  //System.out.println("comman number of array:"+b[i]);
				  }
			  }
		  }
		  
		  
			 int p=0;
			 int m[] = new int[(b.length)+(k.length)];
			for(int i =0;i<=b.length-1;i++)
			{
				m[p++]=b[i];
				
			}
			
			for(int i =0;i<=k.length-1;i++)
			{
				m[p++]=k[i];
				
			}
			
			System.out.println("\n mearge two array"+Arrays.toString(m));
			int z[]=new int[b.length];
			int x[]=new int[b.length];
			int v=0,w=0;
			//int y[]=new int[]
			System.out.println("even number:");
			for(int i=0;i<m.length;i++)
			{
			if(m[i]%2==0)
			{
				System.out.print(m[i]);
				//m[i];
				//System.out.println(m[i]);
			}
			/*else if(m[i]%2==1)
			{     
				x[w++]=m[i];
				//System.out.println("odd"+m[i]);
			}*/
			}
			
			
			System.out.println("odd number:");
			for(int i=0;i<m.length;i++)
			{
			if(m[i]%2==1)
			{
				System.out.print(m[i]);
			}
			}
			/*
			 * System.out.println("even:"+Arrays.toString(z));
			 * System.out.println("odd:"+Arrays.toString(x));
			 */
	        
	}

}
