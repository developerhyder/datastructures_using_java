package searchingalgorithm;

public class LinearSearch {
	// This is a straight search
	
	public static void main(String[] args) {
		int[] values = {1,3,5,6,7,8 };
		int key = 3;
		for(int i=0; i<values.length; i++) if(values[i] == key)System.out.println("found it !!");
		
	}

}
