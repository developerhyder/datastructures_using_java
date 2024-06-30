package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphNew {
	
	int [][] graph ;
	int vertex;
	int [][] dfsMat;
	public GraphNew(int vertex) {
		this.vertex = vertex;
		this.graph = new int[vertex][vertex];
	}
	
	public void addEdge(int a, int b, boolean isBiDirectional, int val) {
		this.graph[a][b] = val;
		if(isBiDirectional) {
			this.graph[b][a] = val;
		}
	}
	
	public void printGraph() {	
		for(int i=0; i<vertex; i++) {
			for(int j=0; j<vertex; j++) {
				System.out.print("("+i+", "+j+") "+ graph[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void BFS(int startVertex) {
		if(startVertex >= vertex) {
			System.out.println("The vertex beyound reach !!");
			return;
		}
		
		Queue<Integer> q = new LinkedList();
		q.add(startVertex);
		int[][] temp = this.graph;
		while(!q.isEmpty()) {
			int ver = q.remove();
			// HERE 2 represents that the vertext is visited
			if(temp[ver][ver] != 2) {
				// VISIT THE VERTEX
				System.out.println("Visiting - "+ ver);
				temp[ver][ver] = 2;
				
				// Explore the neighbouring vertices
				for(int index=0; index < vertex; index ++) {
					if(temp[ver][index] > 0 && temp[index][index] != 2) {
						System.out.println("exploring - "+ temp[ver][index]);
						q.add(index);
					}
				}
			}
		}
		
		for(int i = 0; i < vertex; i++) {
			for(int j=0; j<vertex ; j++) {
				System.out.print(" - "+ temp[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void callDFS(int ver) {
		this.dfsMat = this.graph;
		depthFirstSearch(ver);
	}
	
	public void depthFirstSearch(int ver) {
		System.out.println(" current Vertex "+ ver);
		this.dfsMat[ver][ver] = 2;
		for(int index = 0; index < vertex; index++) {
			if(this.dfsMat[ver][index] > 0  && this.dfsMat[index][index] != 2) {
				depthFirstSearch(index);
			}
		}
	}
	
}
