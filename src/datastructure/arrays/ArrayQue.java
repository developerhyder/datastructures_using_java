package datastructure.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayQue {

	public static int hourglassSum(List<List<Integer>> arr) {
		
		int cols = arr.get(0).size();
		int rows = arr.size();
		int sum=-999;
		int tempsum=-999;
		for(int colIndex=0; colIndex<cols-2;colIndex++) {
			for(int rowIndex=0; rowIndex<rows-2; rowIndex++) {
				
				sum = sum < (
						arr.get(colIndex).get(rowIndex)+ 
						arr.get(colIndex).get(rowIndex+1)+
						arr.get(colIndex).get(rowIndex+2)+
						arr.get(colIndex+1).get(rowIndex+1)+
						arr.get(colIndex+2).get(rowIndex)+
						arr.get(colIndex+2).get(rowIndex+1)+
						arr.get(colIndex+2).get(rowIndex+2)
						) ? (
								arr.get(colIndex).get(rowIndex)+ 
								arr.get(colIndex).get(rowIndex+1)+
								arr.get(colIndex).get(rowIndex+2)+
								arr.get(colIndex+1).get(rowIndex+1)+
								arr.get(colIndex+2).get(rowIndex)+
								arr.get(colIndex+2).get(rowIndex+1)+
								arr.get(colIndex+2).get(rowIndex+2)
								) : sum;
				
				System.out.println("hourglass=\n"+
						" "+arr.get(colIndex).get(rowIndex)+ 
						" "+arr.get(colIndex).get(rowIndex+1)+
						" "+arr.get(colIndex).get(rowIndex+2)+"\n"+
						" "+arr.get(colIndex+1).get(rowIndex+1)+"\n"+
						" "+arr.get(colIndex+2).get(rowIndex)+
						" "+arr.get(colIndex+2).get(rowIndex+1)+
						" "+arr.get(colIndex+2).get(rowIndex+2)
						);
				
				System.out.println(" hgs= "+ tempsum+ " ");
				
			}
			System.out.println();
		}
		
		
		return sum;
	}

	public static void main(String[] args) {
		List<List<Integer>> arr =
				Arrays.asList(
						Arrays.asList(-9, -9 ,-9, 1, 1, 1),
						Arrays.asList(0, -9, 0, 4, 3, 2),
						Arrays.asList(-9, -9, -9, 1, 2, 3),
						Arrays.asList(0, 0, 8, 6, 6, 0),
						Arrays.asList(0, 0, 0, -2, 0, 0),
						Arrays.asList(0, 0, 1, 2, 4, 0)
						);
		
		List<List<Integer>> arr2 =Arrays.asList(
				Arrays.asList(0, -4, -6, 0, -7, -6),
						Arrays.asList(-1, -2, -6, -8, -3, -1),
								Arrays.asList(-8, -4, -2, -8, -8, -6),
										Arrays.asList(-3, -1, -2, -5, -7, -4),
												Arrays.asList(-3, -5, -3, -6, -6, -6),
														Arrays.asList(-3, -6, 0, -8, -6, -7)
		);

		for(List<Integer> ele: arr2) {
			for(Integer item: ele) {
				System.out.print(item+" ");
			}
			System.out.println();
		}
		System.out.println("sum= " +hourglassSum(arr2));
		
	}
}
