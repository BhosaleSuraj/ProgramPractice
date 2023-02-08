package NewSe;
/*
 * aramstrong demostret
 * ex 153  
 *      1*1*1  + 5*5*5 + 3*3*3
 */
public class Armstrong_Number {
	public static void main(String [] a)
	{
		int num=153;
		int temp=num;
		int n=0;
		
		int sum=0;
		
		while(num>0)
		{
			n=num%10;
			
			num=num/10;
			sum = sum + n*n*n;
			
		}
		System.out.println(sum);
		if(temp == sum)
		{
			System.out.println("this is a armstrong number");
		}
		else
		{
			System.out.println("this is a not armstrong number");
		}
	}
	

}
