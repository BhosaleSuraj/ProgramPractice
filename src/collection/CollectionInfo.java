package collection;

import java.util.*;
public class CollectionInfo {
	public static void main(String args[])
	{
		ArrayList<String> name=new ArrayList();
		name.add("aman");
		name.add("ashish");
		name.add("amit");
		name.add("suman");
		name.add("anand");
		name.add("amar");
		name.add("rakesh");
		System.out.println("this is my thread"+name);
		
		System.out.println("this is my thread"+name.get(1));
		name.set(0, "date");
		System.out.println("this is my thread"+name);
		
		for(String Rename:name)
			System.out.println("this is my thread"+Rename);
		
		LinkedList list=new LinkedList();
		 list.add("navnath");
		 list.add("123");
		 list.add("27.78");
		 list.add("true");
		 list.add("f1.6");
		 list.add("navnath");
		 System.out.println("list"+list);
		 
		 ListIterator<String> list1=name.listIterator(name.size());  
         while(list1.hasPrevious())  
         {  
             String str=list1.previous();  
             System.out.println(str);
             
         }  
		 
	}

}
