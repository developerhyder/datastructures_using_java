package graphs;

public class GraphNewImpl {
	public static void main(String[] args) {
//		GraphNew graph = new GraphNew(5);
//		
//		graph.addEdge(0, 1, false, 99);
//		graph.addEdge(0,2, false,50);
//		graph.addEdge(1, 2, false, 50);
//		graph.addEdge(2, 3, false, 99);
//		graph.addEdge(1, 3, false, 50);
//		graph.addEdge(1, 4, false, 50);
//		graph.addEdge(3, 4, false, 75);
		
		
//		graph.printGraph();
		
		// HashMap way
		System.out.println();
		
		GraphMap<Integer> gMap = new GraphMap<Integer>();
		
		gMap.addEdge(0, 1);
		gMap.addEdge(0, 2);
		gMap.addEdge(1, 2);
		gMap.addEdge(2, 3);
		gMap.addEdge(1, 3);
		gMap.addEdge(1, 4);
		gMap.addEdge(3, 4);
		
		gMap.printGraph();
		
		
		GraphNew graph = new GraphNew(5);
		graph.addEdge(0, 1, true, 99);
		graph.addEdge(0,2, true,50);
		graph.addEdge(1, 2, true, 50);
		graph.addEdge(2, 3, true, 99);
		graph.addEdge(1, 3, true, 50);
		graph.addEdge(1, 4, true, 50);
		graph.addEdge(3, 4, true, 75);
		
//		graph.BFS(0);
		graph.printGraph();
		graph.callDFS(4);
		
	}
}
