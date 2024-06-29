package trees;

public class TreeImpl {

	public static void main(String[] args) {
		/**
		 * 				a
		 * 			/		\
		 * 		b				c
		 * 	/		\		/		\
		 * d		e		f		g
		 * */
		
		
		Node root = new Node('a', null, null);
		
		root.left = new Node('b', null, null);
		root.right = new Node('c', null, null);
		
		root.left.left = new Node('d', null, null);
		root.left.right = new Node('e', null, null);
		
		root.right.left = new Node('f', null, null);
		root.right.right = new Node('g', null, null);
		
		System.out.println("data= "+ root.left.right.data);
		
		
		Node root2 = new Node ('a',
				new Node('b',
						new Node('d', null , null)
						,new Node('e', null, null)
						
						),
				new Node('c',
						new Node('f', null, null), 
						new Node('g', null, null)
						)
				);
		
		System.out.println("data= "+ root2.left.right.data);
	}

}
