package NewSe;

import java.util.Scanner;

public class Vyoum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array length");
		int a=sc.nextInt();
		
		int b[]=new int[a];
		
		
		  System.out.print("first array list :");
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
      
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]);
        }
        
        int c[]=new int[a];
        System.out.println("second array list :");
        for(int i=0;i<c.length;i++)
		{
			c[i] = sc.nextInt();
		}
        
       
        for(int i=0;i<c.length;i++)
        {
        	System.out.print(c[i]);
        }
        
        //comman number of given two array
        System.out.print("comman number:");
        for(int i=0;i<b.length;i++)
        {
        	for(int j=0;j<c.length;j++)
        	{
        		if(b[i]==c[j])
        		{
        			System.out.println(b[i]);
        		}
        	}
        }
        
        int d[]=new int[b.length+c.length];
        //mearge two array
        System.out.println("mearge two array");
        for(int i=0;i<b.length;i++)
        {
        	d[i]=b[i];
        	//d[i]=b[i];
        }
        for(int i=0;i<c.length;i++)
        {
        	d[b.length+i]=c[i];
        	//d[i]=c[i];
        } 
        for(int k=0;k<d.length;k++)
        {
        	System.out.print(d[k]);
        }
       System.out.print("even");
        for(int i=0;i<d.length;i++)
        {
        	if(d[i]%2==0)
        	{
        		
        		System.out.println(d[i]);
        		
        	}
        	
        
        }
        System.out.print("odd");
        for(int i=0;i<d.length;i++)
        {
        	if(d[i]%2==1)
        	{
        		
        		System.out.println(d[i]);
        		
        	}
        	
        
        }
	}

}
