package datastructure.stacks;

public class MainStack {

	
	public static void main(String[] args) {
		Stack<Integer> stck = new Stack(10);
		
		for(int index=0; index < 12; index++) {
			if(!stck.push(index)) {
				System.out.println("couldnot add more info to the stack please");
			}
		}
		
		System.out.println("The stack contains : "+ stck.print(5));
//		Integer[] temp = new Integer[10];
//		temp = stck.print();
//		for(Integer in : temp) System.out.println(" "+ in);
		
		System.out.println("Size of stack: "+ stck.sizeOfStack());
		
		System.out.println("reverse");
		int sos =  stck.sizeOfStack();
		for(int sindex=0; sindex<sos; sindex++)
		{
			System.out.print(stck.pop());
		}
		
	}
}
