package collection_framework.list;

public class LinkedListimplementation<E> {
	
	
	
	Node<E> head;
	public void add(E data) {
		Node<E> toadd=new Node<E>(data);
		
		if(isEmpty()) {
			head=toadd;
			return; 
		}
		
		Node<E> temp=head;
		while (temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
	}
	public void print() {
		Node<E> temp=head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	
	public E removelast() throws Exception {
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cannot remove last element from empty list");
		}
		
			if(temp.next==null) {
				Node<E> toremove=head;
				head=null;
				return  toremove.data;
			}
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		
		Node<E> toremove=temp.next;
		temp.next=null;
		
		return (E) toremove.data;
	}
	
	
	public E getlast() throws Exception {
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Cannot peek last element from empty list");
		}
		
			
		
		while(temp.next !=null) {
			temp=temp.next;
		}
		return temp.data;
		
		
	}
	
	


	static class Node<E>{
		E data;
		Node next;
		
		public Node(E data) {
			this.data=data;
			next=null;
		}
	}

}
