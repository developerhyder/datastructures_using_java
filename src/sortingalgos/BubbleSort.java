package sortingalgos;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,5,2,7,8,4};
		int n = arr.length;
		// Note 
		for(int k=0; k<n-1; k++) {
			// NOTE
			for(int i=0; i < n-k-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		for(int i: arr) {
			System.out.println(" - "+ i);
		}

	}

}
