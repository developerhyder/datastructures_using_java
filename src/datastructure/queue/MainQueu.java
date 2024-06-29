package datastructure.queue;

public class MainQueu {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		QueueDS queue = new QueueDS(5);
		
		queue.insert(12);
		queue.insert(13);
//		queue.insert(14);
//		queue.insert(15);
		System.out.println(queue.printQueue());
		queue.insert(16);
		queue.insert(17);
		System.out.println("removed: "+ queue.remove());
		System.out.println(queue.printQueue());
		queue.insert(15);
		System.out.println(queue.printQueue());
		queue.insert(1);
		System.out.println(queue.printQueue());
		
	}
}
