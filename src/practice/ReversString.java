package practice;

public class ReversString {
	public static void main(String [] args)
	{
		String s="amoung the value";
		String revers= "";
		int lon=s.length();
		System.out.println("calculate length"+lon);
		for(int i=lon-1;i>=0;i--)
		{
			revers=revers+s.charAt(i);
			
		}
		System.out.println(s+  "   revers          " + revers);
}
}