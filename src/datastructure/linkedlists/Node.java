package datastructure.linkedlists;

public class Node {

	public int data;
	Node node = null;
	public Node() {
	}
	
	public Node(int data, Node node) {
		this.node = node;
		this.data = data;
	}
}
