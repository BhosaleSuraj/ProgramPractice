package practice;

public class Fibonisis {
	public static void main(String[] args)
	{
		/*      fibonisisi
		 * int a=0,b=1 ,c;
		
		System.out.println(a+"\n"+b);
		
		for(int i=2;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}*/
		
		/*//factorial
		
		int d=1;
		for(int i=1;i<=5;i++)
		{
			d=d*i;
		}
		System.out.println(d);*/
		
		//Pallindrom sttring or not
		/*
		String arg="aman";
		String arg1="";
		
		String temp=arg;
		int b=arg.length();
		for(int i=b-1;i>=0;i--)
		{
			arg1=arg1+arg.charAt(i);
			
		}
		System.out.print(arg1+"  ");
		
		if(arg1.equals(temp))
		{
			System.out.println(" a pallindrom ");
		}
		else
		{
			System.out.println("ths is a not pallindrom string");
		}*/
		
		
		//revers number
		
		/*int a=121;
		int b=0;
		int c=a;
		
		while(a!=0)
		{
			b=b*10+a%10;
			a=a/10;
		}
		System.out.println(b);
		if( c==b)
		{
			System.out.println("thid is pallindro");
		}
		else
		{
			System.out.println("not pallindrom number");
		}*/
	/*   prime number check	
		int a=19;
		int b=0;
		if(a>=0)
		{
			for(int i=1;i<=a;i++)
				
			{
				if(a%i==0)
				{
					b++;
				}
			}
			
			if(b==2)
			{
				System.out.println("this is the number is prime");
			}
			
			else
			{
				System.out.println("this is not primt");
			}
		}
		else
		{
			System.out.println("this is not prime number");
		}
		
		*/
		
		//count the degit
		/*int a=12345566;
		int b=0;
		while(a>0)
		{
			a=a/10;
			b++;
		}
		System.out.println(b);
	*/
		
		//array of matrix
		
	/*	int a[][]= {{12,23},{23,45}};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
		}*/
		
		//find a duplicate value in array
	/*	int a[]= {1,23,4,5,6,71,2,3,5,6,7};
		boolean b=false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					b=true;
				}
			}
		}
		
		if(b==false)
		{
			System.out.println("duplicate are not found");
		}*/
		
		/*find a maximum number in array
		
		int a[]= {1,23,4,5,6,71,2,3,5,6,7};
		int b=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>b)
			{   
				b=a[i];
				
			}
		}
		System.out.println(b); 
		*/
		
	}
	

}
