package datastructure.linkedlists;

public class NodeLinkedList {

	Node first;
	Node last;
	Node temp;
	public NodeLinkedList() {
	}
	
	public void insertAtFirst(int data) {
		first = new Node(data, first);
	}
	
	public void insertAtLast(int data)
	{
		temp = first;
		while(first.node != null) {
			first=first.node;
		}
		
		first.node = new Node(data, null);
		first = temp;
	}
	
	public void displayNode() {
		Node current = first.node;
		while(current.node != null) {
			System.out.print("{ "+current.data+" } - ");
			current=current.node;
			if(first.node == null) System.out.println(" { "+ current.data + " }");
		}
	}

}
