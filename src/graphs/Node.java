package graphs;

public class Node {

	int data;
	Node connectivity;
	Node next;
	boolean isBaseNode = true;
	public Node(int data) {
		this.connectivity = null;
		this.next = null;
		this.data = data;
	}
	
	public Node() {
		
	}
	
	public void setConnectivity(Node connectivity) {
		this.connectivity = connectivity;
	}
	
	
}
