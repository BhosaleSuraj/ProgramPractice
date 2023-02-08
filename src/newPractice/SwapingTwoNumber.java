package newPractice;

public class SwapingTwoNumber {

	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		
		System.out.println("before sawp");
		
	    System.out.println(a);
	    System.out.println(b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("after swap");
	    System.out.println(a);
	    System.out.println(b);
	}
}
