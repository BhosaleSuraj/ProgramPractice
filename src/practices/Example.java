package practices;

public class Example {
	
	public static void main(String args[])
	 {
		Add m=new Add();
		System.out.println(m.show(10, 20 ,40,50,60));
	 }

}
class Add
{
	public int show(int ... a  )
	{
		 System.out.println("Addition of two number");
		 int sum=0;
		 for(int i: a)
		 {
			 sum=sum+i;
		 }
		 return sum;
	}
}