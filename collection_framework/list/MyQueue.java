package collection_framework.list;

public class MyQueue {

	public static void main(String[] args) {
		QueueImplementation<Integer> q=new QueueImplementation<>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(23);
		
		System.out.println(q.dequeue());
		

	}

}
