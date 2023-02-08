package NewSe;


interface First {
	
void show();
default void call()
{
	System.out.println("my second method body");
}
 }

 interface Second {
	void show();

}


class InheritanceMultiple implements First,Second
{

	//@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("my first multiple inheritance program");
	}
	
	public static void main(String[] args)
	{
		InheritanceMultiple t=new InheritanceMultiple();
		t.show();
		t.call();
	}
}