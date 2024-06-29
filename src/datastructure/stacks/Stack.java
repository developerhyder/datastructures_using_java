package datastructure.stacks;


/*
 * push
 * pop
 * peek
 * isEmpty
 * isFull
 * print
 * lookup
 * 
 * */
public class Stack<T> {
	
	int top;
	
	int MAX_SIZE;
	
	T [] stack;
	
	
	public Stack(int size) {
		this.top=-1;
		this.MAX_SIZE=size;
		stack = (T[]) new Object[size];
	}
	
	public boolean push(T data) {
		if(this.isFull())
			return false;
		System.out.println("TOP: "+ this.top);
		this.top ++;
		this.stack[this.top] = data;
		return true;
	}
	
	public T pop() {
		if(this.isEmpty()) return null;
		T temp = stack[this.top];
		top --;
		return temp;
	}
	
	public T [] print() {
		return stack;
	}
	
	public T print(int index) {
		return this.stack[index];
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isFull() {
		return this.top == (this.MAX_SIZE - 1);
	}
	
	public int sizeOfStack() {
		return top + 1;
	}
}
