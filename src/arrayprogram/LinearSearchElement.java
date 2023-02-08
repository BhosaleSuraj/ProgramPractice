package arrayprogram;

public class LinearSearchElement {
	public static void main(String[] args) {
		int a[]= {11,22,33,11,33,44};
		boolean c=false;
		int b=3;
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
			{
				System.out.println("found the element"+i);
				c=true;
			}
		}

		if(c==false)
		{
			System.out.println("Not present value");
		}
	
 
	}
}
