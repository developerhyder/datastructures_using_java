package linkedlists.queues;

public class Queue {

	Node top =null;
	Node bottom = null;
	int length =0;
	
	public void enqueue(int data) {
		if(length == 0) {
			top=new Node(data, null, null);
			bottom = top;
			length ++;
			return;
		}
		
		Node temp = top;
		top = new Node(data, top, null);
		temp.prev = top;
		length ++;
	}
	
	public int dequeue() {
		if(length == 0) return -1;
		int temp_data = bottom.data;
		bottom = bottom.prev;
		bottom.next=null;
		length--;
		return temp_data;
	}
	
	public void printNodes() {
		Node temp = top;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
