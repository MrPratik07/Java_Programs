package collection_framework.list;


import java.util.*;

public class MySet {

	public static void main(String[] args) {
	
	Set<String> s=new HashSet<String>();  //does not have a sequence
	Set<String> s1=new LinkedHashSet<String>(); //elements are in sequence
	Set<String> s2=new TreeSet<String>();    //gets output in sorted manner
	
	s.add("Apple");
	s.add("Banana");
	s.add("Mangoes");
	
	s1.add("Apple");
	s1.add("Banana");
	s1.add("Mangoes");
	
	s2.add("Mangoes");
	s2.add("Banana");
	s2.add("Oranges");
	s2.add("Apple");
	
	//s.addAll(s2);    gets the union
	//s.retainAll(s2); gets the intersection
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	
	System.out.println(s2.containsAll(s)); //use to find the subset
	}

}
