package angularmind;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{   
				if(i==2 & j==1 || i==2&j==2 || i==3&j==1 || i==3&j==2 || i==3&j==3 ||  i==2&j==3 ||i==3&j==4)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
		/*
				12345
				   45
				    5
	*/