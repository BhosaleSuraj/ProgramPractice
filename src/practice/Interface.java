package practice; /*interface the main mechanism the achieve the abstraction
 and the functionality provide the multiple inheritance
 and can  achieve loose coupling*/

interface Interface {
	 
	 public void add();
	
	}

interface Main extends Interface
{
	public void add();
}
class Print implements Interface
{
	public void add ()
	{
		System.out.println("you have to apportunity");
	}
	
	
}
class Room extends Print
{
	public void add()
	{
		System.out.println("the addition of two number:");
	}
}
class Add
{
	public static void main(String args[])
	{
	Interface fs=new Room();
	//Interface f=new Print();
	fs.add();
	fs.add();
	}
}

