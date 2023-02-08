package collection;


import java.util.*;

public class AddNewElement {
	public static void main(String[] args) {
		
		ArrayList<Integer> v=new ArrayList<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(1,80);
		v.add(3,100);
		
		//Iterator i=v.iterator();
		
		Collections.sort(v);
		v.remove(30);
		Collections.reverse(v);
		for(int m:v)
		{
			System.out.println(m);
		}
		
		
	}

}
