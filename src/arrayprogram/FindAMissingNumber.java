package arrayprogram;

public class FindAMissingNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7};
		int sum=0;
		for(int i=0;i<=5;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		int sum2=0;
		for(int i=0;i<=arr.length;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		System.out.println(sum2-sum);
	}

}
