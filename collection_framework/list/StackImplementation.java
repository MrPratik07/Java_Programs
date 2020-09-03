package collection_framework.list;

public class StackImplementation<E> {
	
	private LinkedListimplementation<E> ll=new LinkedListimplementation<E>();
	
	
	void push(E e) {
		
	ll.add(e);	
		
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping from empty list is not allowed");
		}
		return ll.removelast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping from empty list is not allowed");
		}
		
		return ll.getlast();
		
	}

	

}
