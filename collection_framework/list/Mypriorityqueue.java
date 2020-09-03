package collection_framework.list;

import java.util.PriorityQueue;

public class Mypriorityqueue {

	public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<>();
	
	pq.add("Apples");
	pq.add("Oranges");
	pq.add("Bananas");
	pq.add("Mangoes");
	
	System.out.println(pq);
	
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	}

}
