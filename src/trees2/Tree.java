package trees2;

import java.util.List;

public class Tree {

	TreeNode root;
	TreeNode currentNode;
	String jsonSt="";
	public Tree() {
		// TODO Auto-generated constructor stub
	}
	
	public Tree(TreeNode node) {
		this.root = node;
		this.currentNode=node;
	}
	
	public void insertNode(TreeNode node) {
		this.currentNode.addChildren(node);
	}
	
	public void printTree(TreeNode node, String level) {
		System.out.println(level+node.data);
		jsonSt += "{"
				+ "\"data\": \""+node.data+"\"";
		if(node.children == null) {
			jsonSt += ", \"children\": [] }";
			return;
		}
				
		jsonSt += ",\"children\": [ ";
		for(TreeNode childNode : node.children) {
			printTree(childNode, level);
			jsonSt += ",";
		}
		
		jsonSt += "]}";
	}
	
	public void printTree2(TreeNode node, String level) {
		System.out.println(level+node.data);
		jsonSt += "{"
				+ "\"data\":\""+node.data+"\"";
		if(node.children == null) {
			jsonSt += ", \"children\": [] }";
			return;
		}
				
		jsonSt += ", \"children\": [ ";
		int index;
		for(index=0; index<node.children.size()-1; index++) {
			printTree2(node.children.get(index), level);
			jsonSt += ",";
		}
		printTree2(node.children.get(index), level);
		
		jsonSt += "]}";
	}
	
	public String jso() {
		return this.jsonSt;
	}
	public TreeNode addNodeWithChildren(List<String> children) {
		String nodeData = "has Children";
		TreeNode node = new TreeNode();
		for(String ele : children) {
			node.addChildren(new TreeNode(ele, null));
		}
		node.data=nodeData;
		
		return node;
	}
	
	public String htmlString(TreeNode node, String level) {
		level += " ";
		String demo=level+"<ul>\n";
		demo += "<li>"+node.data+"</li>\n";
		
		if(node.children == null) {
			return demo+"</ul>\n";
		}
		
		for(int index=0; index<node.children.size(); index++) {
			demo += htmlString(node.children.get(index), level);
		}
		
		demo += level +"</ul>\n";
		return demo;
	}

}
