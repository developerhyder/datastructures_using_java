package trees;

import java.util.Optional;

public class BSTImpl {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(20);
		bst.insert(19);
		bst.insert(16);
		bst.insert(22);
		bst.insert(21);
		bst.insert(32);
		bst.insert(31);
		bst.insert(33);
		
		/**
		 * 			20
		 * 		19		 22
		 * 	16		   21 		32
		 * 					  31   33
		 * 
		 * */
		
//		System.out.println("insert data= "+ bst.root.right.data);
//		System.out.println("lookup element= 16 "+ bst.lookup(16));
//		System.out.println("lookup element= 17 "+ bst.lookup(17));
//		System.out.println("lookup element= 17 "+ bst.lookup(22));
//		System.out.println("lookup element= 17 "+ bst.lookup(21));
//		System.out.println("lookup element= 17 "+ bst.lookup(33));
//		bst.inOrder(bst.root);
//		System.out.println("\nlookup element= 32 "+ bst.lookup(32));
//		System.out.println("recursive look: "+ bst.rlookup(32));
//		System.out.println("recursive look: "+ bst.rlookup(33));

//		bst.recursiveRemove(bst.root, 32);
//		bst.rRemove(22);
		
//		bst.inOrder(bst.root);
		
		BinarySearchTreeV2 bstv2 = new BinarySearchTreeV2(20);
		bstv2.insert(19);
		bstv2.insert(16);
		bstv2.insert(22);
		bstv2.insert(21);
		bstv2.insert(32);
		bstv2.insert(31);
		bstv2.insert(33);
		bstv2.rRemove(33);
		
		bstv2.inOrder(bstv2.tempRoot);
		
//		Node getNode = bstv2.findNode(44, bstv2.root);
//		Optional.ofNullable(getNode).ifPresentOrElse((item)-> {
//			System.out.println("\nValue is "+ item.data);
//		}, ()->{
//			System.out.println("\nlooks like the value is not there ");
//		});
		
		
	}
}
