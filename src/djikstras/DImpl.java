package djikstras;

public class DImpl {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {1,2, 4, 5,3,8,6};
//		int temp;
//		for(int i=arr.length-1;i>0; i--) {
//			for(int j=0;j<i;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		for(int ele: arr) {
//			System.out.println(ele);
//		}
		
		Graph g = new Graph(5);
		g.addEdge(0, 1, 30);
		g.addEdge(0,2,50);
		g.addEdge(1,2,35);
		g.addEdge(1,3,40);
		g.addEdge(3, 2, 30);
		g.addEdge(3, 4, 12);
		g.addEdge(2, 4, 40);
		
		g.printMatrix();
		
		g.calculateShortestPath(0);
		
	}

}
