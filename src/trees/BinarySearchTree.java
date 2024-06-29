package trees;

public class BinarySearchTree {

	Node root = null;
	
	int leftHeight =0;
	int rightHeight = 0;
	public BinarySearchTree(int data) {
		root = new Node(data, null, null);
	}
	
	/**
	 * 							root
	 * 						/			\
	 * 					less			more
	 * 				/		\			/	    \
	 * 			lesser		lessmore moreless   moremore
	 * */
	
	
	public void insert(int data) {
		Node pointer = root;
		boolean cont = true;
		while(cont) {
			if(data > pointer.data) {
				if(pointer.right == null) {
					pointer.right = new Node(data, null, null);
					break;
				}
				pointer = pointer.right;
			}else {
				if(pointer.left == null) {
					pointer.left = new Node(data, null, null);
					break;
				}
				pointer = pointer.left;
			}
		}
	}
	

	public boolean lookup(int data) {
		Node pointer = root;
		boolean cont = true;
		while(cont) {
			if(data == pointer.data) return true;
			if(data > pointer.data) {
				if(pointer.right == null) {
					break;
				}
				pointer = pointer.right;
			}else {
				if(pointer.left == null) {
					break;
				}
				pointer = pointer.left;
			}
		}
		
		return false;
	}
	
	
	public void traverse() {
		
	}
	
	public void inOrder(Node node) {
		if(node == null) return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	
	public void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	
	
	public void preOrder(Node node) {
		if(node == null) return;
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public boolean remove(int data) {
		// first find the node which has the data
		Node pointer = root;
		boolean cont = true;
		boolean elementfound = false;
		boolean operation_status=false;
		while(cont) {
			if(data == pointer.data) {
				elementfound=true;
				//if this is a leaf node
				if(pointer.left == null && pointer.right == null) {
					pointer=null;
					return true;
				}
				//in case it has only one child
				if(pointer.right == null) {
					pointer = pointer.left;
					return true;
				}
				if(pointer.left == null) {
					pointer = pointer.right;
					return true;
				}
				
				// else find the next successor 
				Node temp = pointer;
				pointer = pointer.right;
				updateTree(
						findTheMinimum(pointer, pointer.data), 
						root, 
						data);
			}
			
			if(data > pointer.data) {
				if(pointer.right == null) {
					break;
				}
				pointer = pointer.right;
			}else {
				if(pointer.left == null) {
					break;
				}
				pointer = pointer.left;
			}
		}
		return operation_status;
	}
	
	public Node findTheMinimum(Node pointer, int value) {
		while(pointer.left != null) {
			pointer = pointer.left;
		}
		return pointer;
	}
	
	public void updateTree(Node value1, Node root, int data) {
		Node temp = root;
		
		while(temp.data!=value1.data) {
			if(value1.data > temp.data) {
				temp = temp.right;
			}else {
				temp = temp.left;
			}
			if(temp.data == data) {
				temp.data = value1.data;
			}	
		}
		temp = null;
	}
	
	public boolean recLookup(Node node, int data) {
		if(node == null) return false;
		if(node.data == data) return true;
		
		if(node.data < data)
			if(recLookup(node.right, data))return true;
		else if (node.data > data)
			if(recLookup(node.left, data))return true;
		
		return false;
		
	}
	
	public boolean rlookup(int data) {
		return recLookup(root, data);
	}
	
	
	public void rRemove(int data) {
		root=recursiveRemove2(root, data);
	}
	
	public void recursiveRemove(Node node, int data) {
		if(node == null) return;
		
		if(node.data < data) {
			recursiveRemove(node.right, data);
		}else if(node.data > data) {
			recursiveRemove(node.left, data);
		}else {
			if(node.left == null && node.right == null) {
				node = null;
			}else if(node.left == null) {
				node = node.right;
			}else if(node.right == null) {
				node = node.left;
			}else {
				Node small = minimum(node.right);
				updateRoot(root, small, node);
			}
			return;
		}
	}
	
	public Node recursiveRemove2(Node node, int data) {
		
		if(node == null) return node;
		
		if(node.data < data)node.right = recursiveRemove2(node.right, data);
		else if(node.data > data) node.left = recursiveRemove2(node.left, data);
		else {
			if(node.right == null) return node.left;
			if(node.left == null) return node.right;
			node.data = minimum(node.right).data;
			node.right = recursiveRemove2(node.right, node.data);
		}
		return node;
	}
	
	public Node minimum(Node node) {
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
	
	public void updateRoot(Node rootNode, Node minimum, Node selected) {
		Node temp = selected.right;
		if(minimum.right != null) {
			
		}else {
			selected.data = minimum.data;
			minimum=null;
		}
	}
	
	
	
}
