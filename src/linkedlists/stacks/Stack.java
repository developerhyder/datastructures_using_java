package linkedlists.stacks;

public class Stack {

	Node top = null;
	Node bottom = null;
	int length=0;
	public Stack() {
	
	}
	
	public void push(int data) {
		if(length ==0) {
			top = new Node(data, null);
			bottom = top;
			length++;
			return;
		}
		top = new Node(data, top);
		length++;
	}
	
	
	public int pop() {
		int temp_data=top.data;
		
		if(length ==0) return -1;
		Node tempNode = top;
		if(top.node!= null)
			top = top.node;
		else 
			top = null;
		length--;
		//This shall free the memory by GC
		tempNode = null;
		return temp_data;
	}
	
	public boolean isEmpty() {
		return length ==0;
	}
	
	public void printNodes() {
		Node temp = top;
		while(top!=null) {
			System.out.println(top.data);
			top=top.node;
		}
		top=temp;
	}
	
	

}
