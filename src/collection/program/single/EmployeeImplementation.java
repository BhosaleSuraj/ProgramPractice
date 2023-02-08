package collection.program.single;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeImplementation {
	public static void main(String[] args) {
		
	
	HashMap<Integer, Employee> hm=new HashMap<>();
	
		
	
	//ArrayList<Employee> ep=new ArrayList<Employee>();
	
	Employee e=new Employee(23,"lax","pune",2345,3445);
	Employee e1=new Employee(23,"lax","pune",2345,3445);
	Employee e2=new Employee(23,"lax","pune",2345,3445);
	Employee e3=new Employee(23,"lax","pune",2345,3445);
	Employee e4=new Employee(23,"lax","pune",2345,3445);
	
	//ep.add(e);
	
	hm.put(1, e);
	hm.put(2, e1);
	hm.put(3, e2);
	hm.put(4, e3);
	hm.put(5, e4);
	
	System.out.println(hm);
	
	
	
	Iterator<Integer> it= hm.keySet().iterator();
	
	while(it.hasNext())
	{ 
		int key=(int)it.next();
		
		
		
		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
	}
	
	
//	for(Employee et:ep)
//	{
//		System.out.println(et);
//	}
//	
//	System.out.println(ep);
//	
//	Iterator<Employee> it=ep.iterator();
//	
//	for(it.hasNext();;)
//	{
//		System.out.println(it.next());
//		break;
//	}
	

	}
}
