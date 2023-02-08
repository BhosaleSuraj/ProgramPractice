package practice;




public class ExampleVargArg {
	public int add(int a , int b)
	{
	return a+b;
	}	

}
class Show
{
	public static void main(String[] args) 
	{
		ExampleVargArg m=new ExampleVargArg();
		System.out.println(m.add(30, 20));
	}

}
