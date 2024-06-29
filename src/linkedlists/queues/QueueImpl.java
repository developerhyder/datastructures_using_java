package linkedlists.queues;

public class QueueImpl {

	
	public static void main(String[] args) {

		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		q.printNodes();
		
		q.dequeue();
		
		q.printNodes();
		System.out.println("length= "+ q.length);
	}

}
