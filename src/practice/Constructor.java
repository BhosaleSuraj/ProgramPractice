package practice;

public class Constructor {       //the example copy constructor
	int x; String y;
	Constructor(int a , String b)
	{
		 x=a;                  
		 y=b;
		 System.out.println(x+"  "+y);
	}
	Constructor(Constructor m)          //pass referance of consructor 
	{
		x=m.x;
		y=m.y;
		System.out.println(x+"   "+y);     // cprint the output    
		
		
	}
	public static void main(String [] srgs)  // the main purpose of constructor tyhe changeble runtime
	{
		Constructor s=new Constructor(112,"ramesh radha");         // to create object  and caalll automatically
		Constructor s1=new Constructor(s);
	}

}
