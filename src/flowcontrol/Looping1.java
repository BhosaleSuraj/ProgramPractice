package flowcontrol;

public class Looping1 {
	public static void main(String args[])
	{
		int n=10; int number;
		for(int i=1;i<=n;i++)
		{
			number=n*i;
           System.out.println(n +"x"+ i+ "="+number);
		}
	}

}
