package my_linkedlist;

public class My_LinkedList<E> 
{
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}
	
	
	public void push(int x) 
	{
		//create a new node and add data
		Node new_node=new Node(x);
		//makes next of node as head
		new_node.next=head;
		//make new_node as head
		head=new_node;
	}
	
	
	public void append(int x) 
	{
		//create a new node and add data
		Node new_node=new Node(x);
		//check if head is empty then make current node as head
		if(head==null) {
			head=new Node(x);
		}
		//make the next of new_node as null
		new_node.next=null;
		//traverse till last node
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
	public void remove(int x) 
	{
		// create new_node and set as head, create prev node and set as null
		Node new_node=head,prev=null;
		//if the key is found
		if(new_node!=null && new_node.data==x) {
			head=new_node.next;
			}
		//while key is not found
		while(new_node!=null && new_node.data!=x) {
			prev=new_node;
			new_node=new_node.next;
			
		}
		//if the node is empty
		if(new_node==null)
			return;
		//unlink the deleted node
		prev.next=new_node.next;
	}
	public void printList() 
    { 
        Node new_node = head; 
        while (new_node != null) { 
            System.out.print(new_node.data + " "); 
            new_node = new_node.next; 
        } 
    } 

}
