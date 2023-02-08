package collection;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class PrintnumberByUsingCollectionFramework {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList<>();
		
		a.add(45);
		a.add("laxman");
		a.add(67);
		
		System.out.println(a);
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
	}

}
