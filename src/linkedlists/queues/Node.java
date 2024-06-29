package linkedlists.queues;


public class Node {

	int data;
	Node next = null;
	Node prev = null;
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	
	public Node() {
		
	}
	
	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	
}
