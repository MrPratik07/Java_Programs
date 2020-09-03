package collection_framework.list;

import java.util.ArrayDeque;

public class dequeMainClass {

	public static void main(String[] args) {
//	ArrayDeque <Integer> ad=new ArrayDeque<>();
//	
//	ad.addFirst(1);
//	ad.addFirst(2);
//	ad.addFirst(3);
//	
//	
//	System.out.println(ad.peek());
//	System.out.println(ad.peekFirst());
//	System.out.println(ad.peekLast());
		
		
		
		Mydeque<Integer> d=new Mydeque<>();
		
		d.addtohead(1);
		d.addtohead(2);
		d.addtohead(3);
		System.out.println(d.removefromlast());
		System.out.println(d.removefromlast());

	}

}
