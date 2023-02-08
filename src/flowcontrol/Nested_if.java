package flowcontrol;

public class Nested_if {
	public static void main(String args[])
	{
		int a=10,b=20,c=40;
		
		if(a>b) //10>20
		{
			if(a>c)  //10>40
			{
				System.out.println("maximum number "+a);
			}
			else
			{
				System.out.println("maximum number"+c);
			}
		}
		else
		{
			if(b>c)  //20>40
			{
				System.out.println("maximum number"+b);
			}
			else
			{
				System.out.println("maximum number"+c);
			}
		}
		
	}

}
