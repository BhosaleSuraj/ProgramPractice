package java8;

class A
{
	public A show()
	{  
		System.out.println("this is parrent class");
		return this;
	}
}

class B extends A
{
	@Override
	public B show()
	{  
		System.out.println("this example is covarient Example");
		return this;
	}
}

public class CovirientReturnType {

	public static void main(String[] args) {
		
		B b=new B();
		b.show();
		
	}
}
