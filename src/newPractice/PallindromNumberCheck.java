package newPractice;

public class PallindromNumberCheck {
	public static void main(String[] args) {
		
		int a=232;
		int temp=a;
		int b=0;
		
		for(int i=0;i<=a;i++)
		{
			b=b*10+a%10;
			a=a/10;
		}
		
		System.out.println(b);
		if(temp==b)
		{
			System.out.println("this is pallindrom");
		}
		else
		{
			System.out.println("this is not a prime");
		}
	}

}
