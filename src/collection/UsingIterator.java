package collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.tools.javac.util.List;

public class UsingIterator {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(23);
		a.add(89);
		a.add(25);
		a.add(12);
		
		Iterator<Integer> it= a.iterator();
		
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
