package linkedlists.stacks;

public class StackImpl {


	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(6);
		stack.push(7);
		stack.push(10);
		
		stack.printNodes();
	
		stack.pop();stack.pop();stack.pop();
		
		stack.printNodes();
		
		System.out.println("length= "+ stack.length);
		
	}

}
