package collection;
import java.util.*;
public class SortArrayCollection {

	public static void main(String[] args)
	{
		List<String> name1=new ArrayList();
		name1.add("raman");
		name1.add("angad");
		name1.add("atish");
		name1.add("ram");
		
		Collections.sort(name1);
		
		for(String first : name1)
			
		System.out.println(first);
		
		List<Integer> name2=new ArrayList();
		name2.add(10);
		name2.add(20);
		name2.add(40);
		name2.add(50);
		
		Collections.sort(name2);
		
		for(int number : name2)
			
		System.out.println(number);
	}
}
