package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CharacterExample {
public static void main(String[] args) {
	

	
	ArrayList<Character> ch= new ArrayList<Character>();
	
	for(char c='a';c<='z';c++)
	{
		ch.add(c);
	}
	System.out.print("[");
	Iterator<Character> it=ch.iterator();
	
	while(it.hasNext())
		
	{
		System.out.print(it.next()+", ");
	}
	
	System.out.println("]");
}
}
