package collection_framework.list;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) {
	List<Integer> a=new ArrayList<>();
	List<Integer> b=new ArrayList<>();
	b.add(4);
	b.add(5);
	
	a.add(1);
	a.add(2);
	a.add(3);
	
	a.remove(1);
	
	b.clear();
	a.size();
	
	
	
	a.addAll(b);
	System.out.println(a);
	System.out.println(a.get(1));
	b.set(1,6);
	System.out.println(b);

	}

}
