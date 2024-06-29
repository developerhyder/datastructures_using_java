package datastructure.linkedlists;

public class App {

	public static void main(String[] args) {
//		Node head = new Node(12, null);
//		Node currentNode = head;
//		for(int index=0; index<10; index++) {
//			currentNode.node = new Node(index+1, null);
//			currentNode = currentNode.node;
////			System.out.println("node data: "+ currentNode.data +" next node info: "+ currentNode.node.data);
//		}
//		
//		currentNode=head;
//		while(true) {
//			System.out.println("data of current node: "+ currentNode.data);
//			if(currentNode.node == null) break;
//			currentNode = currentNode.node;
//		}
		
//		NodeLinkedList ll = new NodeLinkedList();
//		
//		ll.insertAtFirst(1);
//		ll.insertAtFirst(2);
//		ll.insertAtFirst(3);
//		
//		ll.insertAtLast(5);
//		
//		ll.displayNode();
	
		
		
		CircularLinkedList ll = new CircularLinkedList();
		
//		ll.insertAtFirst(1);
//		ll.insertAtFirst(2);
//		ll.insertAtFirst(3);		
//		ll.insertAtLast(5);	
		
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.displayNode();
		
		
	
	
	}
}
