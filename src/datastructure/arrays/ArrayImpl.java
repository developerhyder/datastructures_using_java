package datastructure.arrays;

public class ArrayImpl {

	public static void main(String[] args) {
		ArrayImpl ari = new ArrayImpl();
		ari.print(new int[]{1, 2, 3});
		
		String[] st = new String[3];
		st[0] = "strong";
		st[1] = " storm";
		st[2] = "something";
		
		String[] st2 = st.clone();
		
		for(String stmt: st) {
			System.out.print(stmt);
		}
		System.out.println();
		try {
			st[3] =" some other thing";
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	
	public void print(int[] a) {
		for(int item: a) {
			System.out.println(item);
		}
	}

}
