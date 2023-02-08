package newPractice;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
	
	int a=153;
	int b=a;
	int rem =0;
	int temp=a;
	int leng=0;
	
	int arm=0;
	while(a!=0)
	{
		leng=leng+1;
		a=a/10;
	}
	System.out.println(leng);
	
	while(temp!=0)
	{
		int mul=1;
		rem=temp%10;
		for(int i=0;i<=leng;i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		temp=temp/10;
		
	}
	
	if(arm==b)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not arm");
	}

}
}