package practice;
interface Atom1
{
	void display();
}


interface Atom 
{
	int add(int a,int b);
	
	
}

class A implements Atom,Atom1
{
	public void display()
    {
    	System.out.println("the using a multiple inheritance in java in using");
    }
	
	
    public int add( int m, int n)
   {   
    	int c=m+n;
    	 
    	//System.out.println("asdfgnm");
	   return c;
   }
   
}
class U implements Atom
{
	public int add (int w ,int v)
	{
		w=20;
	    v=15;
		return w-v;
	}
}


public class Multiple {
	public static void main (String[] args)
	{  
		
		Atom p = new A();
		
		
		 int q=p.add(20,30);
		System.out.println("addition of two number"+q);
		
		
		//Atom d=new U();
		 
		System.out.println("substraction of two number"+p.add(q, q));
		
		
		A n=new A(),l=new A();     //one type in create multiple object
		n.display();
		l.display();
		
		new A().display();            //anonymous object  nameless object       
		
		
	}

}
