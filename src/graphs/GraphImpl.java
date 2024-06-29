package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GraphImpl {

	public static void main(String[] args) {
		List<Node> nodes = new ArrayList();
		
		/**
		 * 				0 --------- 1
		 * 				|		   /|\
		 * 				|		/	|	2		
		 * 				|	/		|/	
		 * 				4 --------- 3
		 * */
		
		
		nodes.add(new Node(0));
		nodes.add(new Node(1));
		nodes.add(new Node(2));
		nodes.add(new Node(3));
		nodes.add(new Node(4));
		
		Graph graph = new Graph(nodes);
		
		List<List<Integer>> doubleList = new ArrayList<>();
		
		doubleList.add(Arrays.asList(1, 4));
		doubleList.add(Arrays.asList(0, 2, 3, 4));
		doubleList.add(Arrays.asList(1, 3));
		doubleList.add(Arrays.asList(1, 2, 4));
		doubleList.add(Arrays.asList(0, 1, 3));
		
		
		
		for(Node tempNode : nodes) {
			Iterator it = doubleList.get(tempNode.data).listIterator();
			Node currBaseNode = tempNode;
			while(it.hasNext()) {
				currBaseNode.connectivity = new Node((int) it.next());
				currBaseNode = currBaseNode.connectivity;
			}
		}
		
		graph.printConnectivity(nodes.get(1));
		
//		graph.recursivePrint(nodes.get(1).connectivity);
		
		nodes = graph.remove(4, nodes);
		System.out.println();
		graph.recursivePrint(nodes.get(1).connectivity);
		
	}
}
