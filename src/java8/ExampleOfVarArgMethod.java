package java8;

class M
{
	public void add(int ... a)
	{
		int sum=0;
		for(int x:a)
		{
			sum=sum + x;
		}
		System.out.println("addition of given number:"+sum);
	}
}

public class ExampleOfVarArgMethod  extends M {
	
	
	public static void main(String[] args) {
		ExampleOfVarArgMethod ex=new ExampleOfVarArgMethod();
		ex.add();
		ex.add(10, 20);
		ex.add(10,30,40);
		ex.add(40,50,30,20);
		
	}

	
	

}
