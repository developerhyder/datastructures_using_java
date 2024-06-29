package trees;

public class Node {
	
	int data;
	Node left, right;

	public Node() {
	}

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
