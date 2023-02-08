package practice;

public class Additionoftheseries {
	public static void main(String[] s)
	{
		int a=123456;
		int sum=0;
		while(a>0)
		{
			sum=sum+a%10;
			a=a/10;
		}
		System.out.println("sum of two number"+sum);
	}

}
