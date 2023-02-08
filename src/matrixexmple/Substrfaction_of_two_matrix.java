package matrixexmple;

public class Substrfaction_of_two_matrix {
	public static void main(String[] args) {
		
		
		int a[][]= {
				{2,3,4},
				{3,5,4},
				{4,5,6}
				};
		
		int b[][]= {
				{2, 0, 3},  
                {2, 3, 1},  
                {1, 1, 1}  		          };
		
		
		int row=a.length;
		int col=a[0].length;
		System.out.println(row+""+col);
		
		int sub[][]=new int[row][col];
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sub[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("substraction of two matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sub[i][j]);
			}
			
			System.out.println();
		}
	}

}
