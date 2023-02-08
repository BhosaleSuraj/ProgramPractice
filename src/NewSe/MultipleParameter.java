package NewSe;
interface B
{
	public int addition(int a, int b);
}


public class MultipleParameter {
	
	 public static void main(String [] args)
	  {
		 
	 B add=( a, b)->(a+b);
		
		System.out.println(add.addition(10 , 20));
}
}