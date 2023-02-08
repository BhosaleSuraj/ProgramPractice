package arrayprogram;

public class AdditionOfGivenArray {
	public static void main(String[] args) {
		
		int a[]= {2343,45,56,66,54,890};
		int sum=0;
		int odd=0;
		int even=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+"even number");
			}
			else
			{
				System.out.println(a[i]+"odd number");
			}
		}
	}

}
