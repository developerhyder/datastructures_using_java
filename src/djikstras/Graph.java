package djikstras;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	int vertex;
	int[][] matrix;
	int[][] weights;
	
	//This is the djikstra's table to calculate shortest paths
	
	/**
	 * 		vertex | shortest path | prev vertex
	 * 
	 * */
	int[][] dtable;
	
	public Graph(int size) {
		// TODO Auto-generated constructor stub
		this.vertex = size;
		this.matrix = new int[size][size];
		this.weights = new int[size][size];
		this.dtable = new int[size][2];
		
		//need to initialise the dtable
		for(int index=0; index<size; index++) {
			dtable[index][0] = 999;
			dtable[index][1] = -1;
		}
	}
	
	public void addEdge(int a, int b,int weight) {
		matrix[a][b] = 1;
		matrix[b][a] = 1;
		weights[a][b] = weight;
		weights[b][a] = weight;
	}

	public void printMatrix() {
		for(int i=0; i <vertex;i++) {
			for(int j=0; j<vertex;j++) {
				System.out.print(" ("+i+", "+j+") "+matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nweights\n");
		for(int i=0; i <vertex;i++) {
			for(int j=0; j<vertex;j++) {
				System.out.print(weights[i][j]+" ");
			}
			System.out.println();
		}
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
	
	public void calculateShortestPath(int startVertex) {
		Queue<Integer> q = new LinkedList();
		q.add(startVertex);
		this.dtable[startVertex][0] = 0;
		int currentVertex;
		while(!q.isEmpty()) {
			currentVertex=q.remove();
			System.out.println(" currentVertex: "+currentVertex);
			if(this.matrix[currentVertex][currentVertex] != 2)
			{
				this.matrix[currentVertex][currentVertex]=2;
				int[] tempNeighborList = new int[this.vertex];
				int[] weightList = new int[this.vertex];
				int currpointer=0;
				for(int i=0; i<this.vertex; i++) {
					if(this.matrix[currentVertex][i] == 1 && this.matrix[i][i]!=2) {
						tempNeighborList[currpointer]=i;
						weightList[currpointer] = this.weights[currentVertex][i];
						currpointer++;
					}
				}
				int temp;
				//calculating the neighbor which has the least distance
				for(int i=currpointer-1;i>0; i--) {
					for(int j=0;j<i;j++) {
						if(weightList[j]>weightList[j+1]) {
							temp = weightList[j+1];
							weightList[j+1] = weightList[j];
							weightList[j] = temp;
							
							temp = tempNeighborList[j+1];
							tempNeighborList[j+1] = tempNeighborList[j];
							tempNeighborList[j] = temp;
						}
					}
				}
				System.out.print(" in queue");
				for(int index=0;index<currpointer;index++) {
					System.out.print(" "+tempNeighborList[index]);
					q.add(tempNeighborList[index]);
				}
				System.out.println("\n");
				
				//now update the dtable
				
//				for(int index=0;index<currpointer;index++) {
//					if(this.dtable[tempNeighborList[index]][0] > this.dtable[tempNeighborList[currentVertex]][0] + weightList[index]) {
//						this.dtable[tempNeighborList[index]][0] = this.dtable[tempNeighborList[currentVertex]][0] + weightList[index];
//						if(startVertex!=currentVertex)this.dtable[tempNeighborList[index]][1] =  currentVertex;
//					}
//				}
				
				for(int index=0;index<currpointer;index++) {
					int wupdate = this.dtable[currentVertex][0] + weightList[index];
					if(wupdate < this.dtable[tempNeighborList[index]][0]) {
						this.dtable[tempNeighborList[index]][0] = wupdate;
						this.dtable[tempNeighborList[index]][1] = currentVertex;
					}
				}
				
				for(int index=0;index<this.dtable.length;index++) {
					System.out.println("v: "+ index+" sp: "+dtable[index][0]+" pv: "+dtable[index][1]);
				}
				
			}
			
		
		}
	}
	
	public void updateDTable(int curr) {
		
		
	}
	
}
