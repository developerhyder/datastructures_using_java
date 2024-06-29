package graphs;

import java.util.List;

public class Graph {

	List<Node> baseNodes;
	public Graph(List<Node> node) {
		this.baseNodes = node;
	}

	public void addConnectivity(Node baseNode, Node connectivity) {
		baseNode.setConnectivity(connectivity);
	}
	
	public void printConnectivity(Node baseNode) {
		Node tempNode = baseNode.connectivity;
		if(tempNode == null) {
			System.out.println("error cannot seem to find connectivity");
			return;
		}
		
		while(tempNode != null) {
			System.out.print(tempNode.data + " -> ");
			tempNode = tempNode.connectivity;
		}
	}
	
	
	public void recursivePrint(Node baseNode) {
		if(baseNode == null) return;
		System.out.print( baseNode.data +" " );
		recursivePrint(baseNode.connectivity);
	}
	
	public List<Node> remove(int data, List<Node> nodes) {
		for(Node node: nodes) {
			//if the node is the base node
			if(node.data == data) {
				node.data = -1;
			}else {
				Node tempNode = node.connectivity;
				Node prev = node;
				while(tempNode != null) {
					// that is to say the data is found
					if(tempNode.data == data) {
						//if there is one more node after this
						if(tempNode.connectivity != null) {
							prev.connectivity = tempNode.connectivity;
							break;
						}else {
							prev.connectivity=null;
							break;
						}
					}
					prev=prev.connectivity;
					tempNode = tempNode.connectivity;
				}
			}
		}
		return nodes;
	}
	
}
