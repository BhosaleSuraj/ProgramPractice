package NewSe;

public class FactorialProgram {
	
	static int factorial (int a)
	{
		if(a==0)
		{
			return 1;
		}
		else
		{
			return(a*factorial(a-1));
		}
	}
	
	
	
	public static void main(String [] args)
	{
		
	//using for loop
	
	int n=10;
	int fact=1;
	for(int i=1; i<=n;i++)
	{
		fact=fact*i;
		System.out.println(fact);
	}
	
	//using while loop
	int m=5;
	int j=1;
	int fcto=1;
	while(j<=m)
	{
		fcto=fcto*j;
		System.out.println(fcto);
		j++;
		
	}
	
	//using recursion
	
	
	int facto=1;
	int num=5;
	facto=factorial(num);
	System.out.println(facto);
	
	

}}
