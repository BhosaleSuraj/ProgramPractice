package NewSe;

import java.util.*;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;



public class Practice {
	public static void main(String [] args)
	{
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array length");
		int a=sc.nextInt();
		int arr[];
		arr= new int[a];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter array number");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("whole array :"+arr[i]);
		} 
*/
		//addition of arrays element
	/*	 int arr[]= { 12,34,5,5,6,6};
		int temp=0;
		int ava=0;
		//int n = arr[].length();
		for(int i=1;i<arr.length;i++)
		{
			temp=temp+arr[i];
			
		}
		int tm=temp/arr.length;
		System.out.println("addition of given arry : "+tm);
		System.out.println(temp);
		
		List<Integer> list=new ArrayList<Integer> ();
		 list.add(12);
		 list.add(12);
		 list.add(12);
		 list.add(12);
		 list.add(12);
		 list.add(12);
		 
		 int t=0;
		
		 for(int m : list)
		 {
			 t=t+m;
		 }
		 System.out.println(t);
		// addition of given array to give the user through value
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a array length:4");
		int a=sc.nextInt();
		int b [] = null;
		
		b= new int[a];
		
		for(int i=1;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("following number print");
		int temp=0;
		for(int i=1;i<b.length;i++)
		{
			temp=temp+b[i];
		}
		System.out.println("addition of given array "+temp);
		int r=temp/b.length;
		System.out.println("avarage of given number of array "+r);
		
		
		// given array  to find the even and odd number
		
		int a[]= {1,2,3,4,5,5,6,7,8,9,6};
		int even=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{    
				even++;
				
				
			}
			else
			{   
				odd++;
				
				
			}
			System.out.println("this number is even:" + a[i]+"  "+even);
			System.out.println("this number is odd :"+ a[i]+"  "+odd);
		}
		System.out.println("this number is even:" + "  "+even);
		System.out.println("this number is odd :"+ "  "+odd);
		
		
		// find a odd and even number and store a new two array
		int a[];
		a=new int[] {10,23,4,5,56,78,8};
	
		 int even=0;
		 int odd=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}
		
		int m[]=new int[even];
		int n[]=new int[odd];
		
		
		int j=0;
		int i=0;
		int l=0;
		int s=0;
		// for(int k=0;k<a.length;k++)
		for(int p:a)
		{
			//	if(a[k]%2==0)
			//	{
			//		 m[i++] =a[k];
			//	}
			//	else
			//	{
			//	   n[j++] = a[k];
			//	}
				
			 
			if(p%2==0)
			{
				m[i++] = p;
				
				
			}
			else
			{
				n[j++]=p;
			}
			
			
		}
		
		
		 System.out.println(Arrays.toString(m));
		 System.out.println(Arrays.toString(n));
		
	
		// the given array to find a even and odd and addition of this number
		
		int a[]= {12,2,34567,789,5678,67};
		
		//int m [] =new int[8]; int n[]=new int[8];
		int l=0 ,s=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{   
				l=l+a[i];
				
			}
			else
			{ 
				s=s+a[i];
				
			}
		} 
		
		System.out.println(l);
		System.out.println(s);
		
		//remove odd number in array
		int a []= {1,2,3,4,5,6,7,8,9};
		
		int d=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				d++;
			}
		}
		System.out.println(d); 
		
		
		int b[] =new int[d];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[c++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b)); 
		*/
		/*int n=0,m=0,o=0;
		int a[]= {1,-3,5,-5,6,7,0,-7,0};
		for(int i=0;i<a.length;i++)
		{   
			if(a[i]>0)
			{
				m++;
			}
			else if (a[i]<0)
			{
				o++;
			}
			else 
			{
				n++;
			}
		}
		System.out.println("zero value is:"+n);
		System.out.println("positive number count is:"+m); 
		System.out.println("negative number count is:"+o);
		*/
		/*
		// addition of the positive number of array amd print the number of another array
		int a[]= {1,-3,5,-5,6,7,0,-7,0};
		int n=0,m=0,o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				m++;
			}
			else if (a[i]<0)
			{
				o++;
			}
			else 
			{
				n++;
			}
		}
		
		int b[]=new int[m];
		int c[]=new int[o];
		int d[]=new int[n];
		int j=0,k=0,l=0;
		 int p=0;
		 int q=0;
		 int r=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[j++]=a[i];
				p=p+a[i];
				
			}
			else if (a[i]<0)
			{
				c[k++]=a[i];
				q=q+a[i];
			}
			else if(a[i]==0)
			{
				d[l++]=a[i];
				
			}
		}
		
		System.out.println("this array is positive: "+Arrays.toString(b));
		System.out.println("this array is positive of addition: "+p);
		System.out.println("this array is negative: "+Arrays.toString(c));
		System.out.println("this array is negative number of addition: "+q);
		System.out.println("this array is zero: "+Arrays.toString(d));
		
		
		//addition of comulative number
		
		int a[]= {2,3,4,5,6};
		int f=a.length;
		int m=0;
		int t=0;
		for(int i=0;i<f;i++)
		{
		
			m=m+a[i];
			t=m/f;
			
		}
		
		//int b[]=new int[m];
		int j=0;
		long[] v;
		
		  int h[]=new int[9];
		   h[0]=t;
		for(int i=0;i<a.length;i++)
		{
			
				j=j+a[i]  ;          // 1+2+
				
				a[i]=j;
				if(a[i]>h[0])
				{
					System.out.println(a[i]);
				}
				
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
		// addition of two array
		int a[]= {2,3,4,5,6};
		int b[]= {1,2,3,4,5,6,7};
		int c[]=new int [b.length];
		
		for(int i=0;i<a.length;i++)
		{
			
				c[i]=a[i]+b[i];
			
			
		}
		System.out.println(Arrays.toString(c));  
		
		
		//one array copy of another array
		int a[]= {10,2,3,4,5,6,7};
		 int b[]=a;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		 int copy[]=Arrays.copyOf(a, a.length);
// copy of multidimentional array
       System.out.println(Arrays.toString(copy));
       int [][] h = {{2,2},{3,4},{3,6}};
		 int l[][]=Arrays.copyOf(h,h.length);
		 int m[][]=h.clone();
		 System.out.println(Arrays.deepToString(l)+""+Arrays.deepToString(m));
		
		//merge two array
		
		int a[]= {2,3,4,5,6};
		int b[]= {1,2,3,4,5,6,7};
		List list=new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object []c=list.toArray();
		System.out.println(Arrays.toString(c));
		 */
		
		/*
		//reveres array 
		int a[]= {12,33,55,66,3,5,6};
		
		System.out.println("after sorting"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("before sorting"+Arrays.toString(a));
		
		int max=0;
		max=a[0];
		int min=0;
		min=a[0];
		int smax=0;
		smax=a[0];
		{
			for(int i=0;i<a.length;i++)
			{
				if( a[i]> max  )
				{
					smax=max;
					max=a[i];
					
				}
				else if(smax<a[i])
				{
					smax=a[i];
				}
				
				    
				
			}
			System.out.println(smax);
			System.out.println(max);
			
			for(int i=0;i<a.length;i++)
			{
				if(  min>a[i] )
					min=a[i];
				
			}
			System.out.println(min);
		}
		int b=a.length;
		int [] r=new int[b];
		int j=0;
		for(int i=b-1;i>=0;i--)
		{
			
			r[j++] = a[i];	
			
		}
		System.out.println("reveers array"+Arrays.toString(r));
	}
*/
	
	/*	
		//lineaar search array
		
		int a[]= {10,20,40,50,10,20,39};
		int b=20;
		boolean c=false;
		// b=a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if(b==a[i])
			 {
				 System.out.println("this value avilable"+i);
				 c=true;
			 }
			
			
		 }
		 if(c==false)
		 {
			 System.out.println("this not avilable value");
		 }*/
		
		
		//Binary search array program
		
		//Remove duplicate element
		int a[]= {12,34,67,9,9,-0,78,66,66};
		
		int temp[] =new int[a.length];
		
		int j=0;
	      for(int i=0;i<a.length-1;i++)
	      {
	    	  if(a[i]!=a[i+1])
	    	  {    
	    		  
	    		 temp[j]=a[i];
	    		 j++;
	    		 
	    	  }
	    	 
	      }
	      temp[j]=a[a.length-1];
	      for(int i=0;i<temp.length-1;i++)
	      {
	    	  System.out.println(temp[i]);
	      }
	     
	      
		 
	}
}
