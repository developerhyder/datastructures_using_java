package trees;

import java.util.Optional;

public class BinarySearchTreeV2 extends BinarySearchTree{
	
	Node tempRoot;
	public BinarySearchTreeV2(int data) {
		super(data);
		this.tempRoot= null;
	}
	
	public void removeNodeV2() {
		this.tempRoot = super.root;
		
	}
	
	/**
	 * 			20
	 * 		19		 22
	 * 	16		   21 		32
	 * 					  31   33
	 * 
	 * */
	public Node findNode(int data, Node tempNode) {		
		boolean cont = true;
		while(cont) {
			if(tempNode== null)
			{
				// GENTLEMEN we are at the end
				return null;
			}
			if(tempNode.data < data) {
				tempNode = tempNode.right;
			}else if(tempNode.data > data) {
				tempNode = tempNode.left;
			}else
				return tempNode;
		}
		return null;
	}

	public void rRemove(int data) {
		recursiveRemoveV2(data, this.tempRoot);
	}
	
	public void recursiveRemoveV2(int data, Node node) {
		if(node == null )return;
		if(node.data<data) recursiveRemoveV2(data, node.right);
		else if(node.data > data )  recursiveRemoveV2(data, node.left);
		else {
			// Element is found
			System.out.println("we found the element "+ node.data);
			if(node.left == null) {
				node= node.right;
			}else if(node.right == null) {
				node = node.left;
			}else {
				
			}
		}
	}
	
}
