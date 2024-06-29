package graphs;

public class GraphMatrixImpl {

	public static void main(String[] args) {
		GraphMatrix gm = new GraphMatrix(5);
		
		gm.addEdge(0,1);
		gm.addEdge(0,3);
		gm.addEdge(0, 2);
		gm.addEdge(1,3);
		gm.addEdge(2,3);
		gm.addEdge(3,4);
		
		
		gm.printMatrix();
		
//		gm.removeVertex(1);
		gm.printMatrix();
		
//		gm.breadthFirstSearch(0);
		gm.callDFS(0);
		
	}
}
