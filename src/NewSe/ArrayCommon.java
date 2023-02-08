package NewSe;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCommon {

		public static void main(String[] args) {
			
			
			  Scanner sc=new Scanner(System.in);
			  
			  //first array give user through 
			  System.out.print("enter first array"); 
			  int c=sc.nextInt(); 
			 // int d=0; 
			  int a[]= new int[c]; 
			//  int b[]=new int[c]; 
			  
			  for(int i=0;i<=a.length-1;i++) 
			  { 
				  a[i]=sc.nextInt(); 
				 // b[d++]=a[i]; 
			  } 
			  
			  System.out.print("enter second array"); 
			  int g= sc.nextInt(); 
			 // int h=0; 
			  //int l[]= new int[g]; 
			  int b[]=new int[g]; 
			 // int k[]=new int[g]; 
			  for(int j=0;j<=b.length-1;j++) 
			  {
				  b[j]=sc.nextInt();
				 // k[h++]=a[j];
			  } 
			  // int p=a.length;
			  System.out.println(a);
			  System.out.println(b);
			  System.out.println("first aray"+Arrays.toString(a));
			  System.out.println("second aray"+Arrays.toString(b));
			 
			
				/*
				 * int b[] = {1,2,3,4}; int k[] = {5,6,7,8};
				 */
			  System.out.print("comman number of array:");
			  for(int i=0;i<a.length;i++)
			  {
				  for(int j=0;j<b.length;j++)
				  {
					  if(a[i]==b[j])
					  {  
						  System.out.print(a[i]+",");
						  //System.out.println("comman number of array:"+b[i]);
					  }
				  }
			  }
			  
			  
				 int p=0;
				 int m[] = new int[(a.length)+(b.length)];
				for(int i =0;i<=a.length-1;i++)
				{
					m[p++]=a[i];
					
				}
				
				for(int i =0;i<=b.length-1;i++)
				{
					m[p++]=b[i];
					
				}
				
				System.out.println("\n mearge two array"+Arrays.toString(m));
				/*int z[]=new int[b.length];
				int x[]=new int[b.length];
				int v=0,w=0;
				//int y[]=new int[]
				for(int i=0;i<m.length;i++)
				{
				if(m[i]%2==0)
				{
					z[v++]=m[i];
					//m[i];
					//System.out.println(m[i]);
				}
				else
				{     
					x[w++]=m[i];
					//System.out.println("odd"+m[i]);
				}
				}
				System.out.println("even:"+Arrays.toString(z));
				System.out.println("odd:"+Arrays.toString(x));
		        */
		}

	}
