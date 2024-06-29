package tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Trie {

	Node root;
	public Trie() {
		root = new Node('*', new HashMap<>());
		root.setRoot(true);
	}

	public Character nextChar() {
		return null;
	}
	
	public void insertChar(char[] ch) {
		Node temp = root;
		for(char character : ch) {
//			if(temp.isRoot()) continue;
			if(!temp.getDictionary().containsKey(character)) {
				temp.getDictionary().put(character, new Node(character, null));
			}
			temp = temp.getDictionary().get(character);
			if(temp.getDictionary() == null)temp.setDictionary(new HashMap<>());
		}
	}
	
	public void trieDisplay(Node node) {
		
		if(node.getDictionary().isEmpty()) {
			System.out.println(node.getData());
			return;
		}
		System.out.print("node : "+ node.getData() +" ");
		List<Node> ln = new ArrayList<Node>(node.getDictionary().values());
		for(Node nd: ln) {
			System.out.print(" "+nd.getData()+ " ");
		}
		System.out.println();
		for(Node nd: ln) {
			trieDisplay(nd);
		}
	}
	
	public void buildDictionary(String para) {
		String[] data = para.split(" ");
		char[] ksh;
		for(String somedata: data) {
			insertChar(somedata.toCharArray());
		}
	}
	
	
	public void findSimilar(String inputData) {
		char[] ch = inputData.toCharArray();
		Node temp = root;
		boolean isValidFlag = true;
		for(char che : ch) {
			if(!temp.getDictionary().containsKey(che)) {
				System.out.println("pattern not found!!!");
				isValidFlag = false;
				break;
			}else {
				temp = temp.getDictionary().get(che);
			}
		}
		System.out.print(inputData + "-");
		if(isValidFlag)
		this.printNode(temp);
	}
	
	public void printNode(Node node) {
		if(node.getDictionary().isEmpty()) {
			System.out.print(node.getData()+" ,");
			return;
		}
		System.out.print(node.getData());
		List<Node> ln = new ArrayList<Node>(node.getDictionary().values());
		for(Node nd: ln) {
			printNode(nd);
		}
	}
}
