package angularmind;

public class PattarnAlphabeats {
	public static void main(String[] args) 
	{   
		char i,j;
		for(i='E';i>='A';i--)
		{
			for(j='E';j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
						/*
						E
						ED
						EDC
						EDCB
						EDCBA
						*/