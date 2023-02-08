package java8;

interface MethodRef
{
	public void some();
}


public class ClassStaticMethodReferance {
	
	public static void refer()
	{
		System.out.println("this is static method referance");
	}
	
	public static void main(String[] args) {
		
		MethodRef mr= ClassStaticMethodReferance::refer;
		mr.some();
	}

}
