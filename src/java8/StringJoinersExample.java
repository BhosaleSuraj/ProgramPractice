package java8;

import java.util.StringJoiner;

//that means add value of string in multiple object
//seperate the string comma and underscore
public class StringJoinersExample {
	
	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner(",");
		
		sj.add("lakhan");
		sj.add("lakhan");
		sj.add("lakhan");
		sj.add("lakhan");
		sj.add("lakhan");
		sj.add("lakhan");
		
	System.out.println(sj);
		
	}

}
