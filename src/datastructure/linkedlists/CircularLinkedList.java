package datastructure.linkedlists;

public class CircularLinkedList {

	Node first;
	Node last;
	Node temp;
	public CircularLinkedList() {
	}
	
//	public void insertAtFirst(int data) {
//		if(first==null) {
//		first = new Node(data, first);
//		last = first;
//		}else {
//			first = new Node(data, first);
//		}
//	}
//	
//	public void insertAtLast(int data)
//	{
//		if(first == null) {
//			first = new Node(data, first);
//		}else {
//			last = new Node(data, last);
//			last.node = first;
//			//last = last.node;
//		}
//		
//	}
	
	
	public void insert(int data) {
		if(first == null)
		{
			first = new Node(data, first);
			last=first;
		}
		else {
			System.out.println("previous data: "+last.data);
			last = new Node(data, last);
			last.node=first;
//			last = last.node;
		}
	}
	
	public void displayNode() {
		Node current = first;
		while(current != first.node) {
			System.out.print("{ "+current.data+" } - ");
			current=current.node;
			if(current.node == null) System.out.println(" { "+ current.data + " }");
		}
	}


}
