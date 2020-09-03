package collection_framework.list;

import collection_framework.list.LinkedListimplementation.Node;

public class QueueImplementation<E> {

	private Node<E> head,rear;
	public void  enqueue(E e) {
		Node<E> toadd=new Node(e);
		if(head==null) {
			head=rear=toadd;
			return;
		}
		
		rear.next=toadd;
		rear=rear.next;
		
		
		
	}
	
	public E dequeue() {
		
		if(head==null) {
			return null;
		}
	Node<E> temp=head;
	head=head.next;
	return temp.data;
	}

}
