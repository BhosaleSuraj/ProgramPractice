package java8;

interface InRef
{
	public void something();
}

public class InstatceMethodReferance {
	
	public void saySomething()
	{
		System.out.println("this is the instance method rferance");
	}
	
	public static void main(String[] args) {
		
		InstatceMethodReferance ir=new InstatceMethodReferance();
		
		InRef irr= ir::saySomething;
		
		irr.something();
	}

}
