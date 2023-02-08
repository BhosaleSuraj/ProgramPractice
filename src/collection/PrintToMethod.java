package collection;
import java.util.*;
import java.lang.*;

public class PrintToMethod {
	
	public static void main(String[] args) 
	{
		List<Student> s=new ArrayList<>();
		
		s.add(new Student(1,25));
		s.add(new Student(2,29));
		s.add(new Student(3,35));
		s.add(new Student(4,45));
		s.add(new Student(5,85));
		
		Collections.sort(s,(s1,s2)->
		{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
		});
		for(Student m:s)
		{
			System.out.println(m);
		}
	}
	
	

}
class Student
{
	int rollno;
	int marks;
	public Student(int rollno, int marks)
	{
		
		this.rollno = rollno;
		this.marks = marks;
	}
	public String toString()
	{
		return "Student{"+"rollno"+rollno+"marks"+marks+'}';
		
	}
	
}
