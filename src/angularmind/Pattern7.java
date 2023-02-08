package angularmind;

public class Pattern7 {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			int count=1;
			for(int j=0;j<5;j++)
			{
				if(j+i<=4)
				{
					System.out.print(j+i+1);
				}
				else
				{
					System.out.print(count++);
				}
				
				
			}
			System.out.println();
		}
	}

}

         /*
            12345
            23451
            34512
            45123
            51234 
          
          */
