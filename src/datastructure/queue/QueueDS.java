package datastructure.queue;

public class QueueDS<T> {

	T [] queueFrame;
	int front;
	int rear;
	int nItems;
	int max_size;
	
	public QueueDS(int size) {
		this.front = 0;
		this.rear = -1;
		this.max_size=size;
		this.queueFrame = (T[])new Object[size];
		nItems = 0;
	}
	
	public void insert(T data) {
		if(this.rear == this.max_size - 1) this.rear = -1;
		this.rear++;
		this.queueFrame[rear] = data;
		this.nItems ++;
	}
	
	public T remove() {
		T temp=this.queueFrame[this.front];
		if(this.front == this.max_size -1) this.front=0;
		this.queueFrame[this.front] = null;
		this.front ++;
		this.nItems --;
		return temp; 
	}
	
	public T peekFirst() {
		return this.queueFrame[this.front];
	}
	
	public String printQueue() {
		StringBuffer sb = new StringBuffer();
		
		for(int item=0; item <queueFrame.length ; item++) {
			sb.append(queueFrame[item]+ "  :  ");
		}
		return sb.toString();
	}
	
	
	
}
