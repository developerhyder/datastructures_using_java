package tries;

import java.util.Dictionary;
import java.util.HashMap;

public class Node {

	private boolean isRoot=false;
	private Character data;
	private HashMap<Character, Node> dictionary;
	
	public Node(char character,HashMap<Character, Node> dict) {
		this.dictionary = dict; 
		this.data=character;
	}
	
	public Node() {
		
	}
	public boolean isRoot() {
		return isRoot;
	}
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}
	public Character getData() {
		return data;
	}
	public void setData(Character data) {
		this.data = data;
	}

	public HashMap<Character, Node> getDictionary() {
		return dictionary;
	}

	public void setDictionary(HashMap<Character, Node> dictionary) {
		this.dictionary = dictionary;
	}
	
}
