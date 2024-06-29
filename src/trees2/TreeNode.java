package trees2;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	String data;
	List<TreeNode> children;
	int childCount;
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	public TreeNode(String data, List<TreeNode> children) {
		this.data=data;
		this.childCount = children != null ? children.size() - 1 : 0;
		this.children = children;
	}
	
	public void addChildren(TreeNode node) {
		if(this.children != null) {
			this.children.add(node);
		}else {
			this.children = new ArrayList<TreeNode>();
			this.children.add(node);
		}
	}

}
