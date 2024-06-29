package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix {

	int matrix[][];
	int vertex;
	int tempMatr[][];
	
	public GraphMatrix(int vertex) {
		// TODO Auto-generated constructor stub
		this.vertex = vertex;
		matrix = new int[vertex][vertex];
		
	}
	
	public void addEdge(int a, int b) {
		matrix[a][b] = 1;
		matrix[b][a] = 1;
	}
	
	
	public void printMatrix() {
		for(int i=0; i <vertex;i++) {
			for(int j=0; j<vertex;j++) {
				System.out.print(" ("+i+", "+j+") "+matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
	}
	
	public void removeEdge(int a, int b) {
		matrix[a][b] =0;
		matrix[b][a]=0;
	}
	
	
	public void removeVertex(int ver) {
		if(ver >= this.vertex) {
			System.out.println("vertex is not present");
			return;
		}
		
		while(ver < this.vertex-1) {
			
			for(int i=ver;i<this.vertex-1; i++) {
				matrix[i][ver] = matrix[i][ver+1];
			}
			
			for(int j=0;j<this.vertex-1;j++) {
				matrix[ver][j] = matrix[ver+1][j];
			}
			ver ++;
		}
		this.vertex--;
	}
	
	public void breadthFirstSearch(int startVertex) {
		if(startVertex >= this.vertex ) {
			System.out.println("nope the vertex does not exist");
			return;
		}
		Queue<Integer> q = new LinkedList();
		q.add(startVertex);
		int tempMat[][] = this.matrix;
		while(!q.isEmpty()) {
			int ver = q.remove();
			if(tempMat[ver][ver]!=2) {
				System.out.print(" "+ver);
				tempMat[ver][ver] =2;
				for(int index=0; index<this.vertex;index++) {
					if(tempMat[index][ver]==1) {
						if(tempMat[index][index]!=2) {
							q.add(index);
						}
					}
				}
			}
		}
		
		for(int i=0; i <vertex;i++) {
			for(int j=0; j<vertex;j++) {
				System.out.print(" ("+i+", "+j+") "+tempMat[i][j]);
			}
			System.out.println();
		}
	}
	
	public void callDFS(int ver) {
		tempMatr = this.matrix;
		depthFirstSearch(ver);
		
	}
	public void depthFirstSearch(int ver) {
		//visit the matrix
		System.out.println("current Vertex: "+ ver);
		
		tempMatr[ver][ver] = 2;
		//find all the neighbors  
		for(int index=0; index<this.vertex; index++) {
			if(tempMatr[ver][index]==1) {
				if(tempMatr[index][index]!=2) {
					depthFirstSearch(index);
				}
			}
		}
	}

}
