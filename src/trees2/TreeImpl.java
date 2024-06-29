package trees2;

import java.util.Arrays;

public class TreeImpl {

	public TreeImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("hello there");
		
		Tree tree = new Tree(new TreeNode("root", null));
		
		tree.insertNode(new TreeNode("child1", null));
		tree.insertNode(new TreeNode("child1", null));
		tree.insertNode(new TreeNode("child1", null));
		tree.insertNode(tree.addNodeWithChildren(Arrays.asList("1", "2", "3")));
		tree.insertNode(tree.addNodeWithChildren(Arrays.asList("1", "2", "3")));
//		tree.printTree2(tree.root, "-");
//		System.out.println(tree.jsonSt);
		System.out.println(tree.htmlString(tree.root, ""));
	}
}
