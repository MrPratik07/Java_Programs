package collection_framework.list;

import java.util.LinkedList;

public class myLinkedList {

	public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(1);
	ll.add(2);
	ll.add(3);
	
	System.out.println(ll);
	System.out.println(ll.get(1));
	ll.set(0,0);
	System.out.println(ll);
	

	}

}
