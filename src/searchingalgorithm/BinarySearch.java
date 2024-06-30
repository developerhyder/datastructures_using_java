package searchingalgorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2,5, 6,9,10, 12};
		int mid = arr.length - 1;
		int start = 0;
		int end = arr.length - 1;
		int key = 10;
		while(mid > 0) {
			mid = (end + start) / 2;
			System.out.println("key : "+ arr[mid]);
			if(arr[mid] == key) {
				System.out.println("found it");
				return;
			} else if(arr[mid]<key) {
				start = mid;
				
			} else if(arr[mid]>key) {
				end = mid;
			}
		}
		
	}
}
