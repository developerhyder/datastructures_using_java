package heap;

public class Heap {
	int[] heap;
	int size;
	public Heap(int size) {
		this.heap = new int[size];
		this.size = 0;
	}
	public int getMin() {
		return heap[0];
	}
	private int getRightChildIndex(int parentIndex) {	
		return parentIndex * 2 + 2;
	}
	private int getLeftChildIndex(int parentIndex) {
		return parentIndex * 2 + 2;
	}
	private int getParentIndex(int childIndex) {
		return (childIndex-2)/2;
	}
	private boolean hasRightChild(int index) {
		return this.getRightChildIndex(index) < size;
	}
	
	private boolean hasLeftChild(int index) {
		return this.getLeftChildIndex(index) < size;
	}
	
	
	private int leftChild(int index) {
		return this.heap[this.getLeftChildIndex(index)];
	}
	
	private int rightChild(int index) {
		return this.heap[this.getRightChildIndex(index)];
	}
	
	
	public void push(int data) {
		this.heap[size] = data;
		size++;
	}
	
	public int[] getAllData() {
		return this.heap;
	}
	
}
