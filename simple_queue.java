package assignment;

public class simplequeue {
	private int capacity = 5;
	private int front = -1;
	private int rear = -1;
	private int size = 0;
	int [] arr = new int[capacity];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simplequeue q1 = new simplequeue();
		q1.enqueue(5);
		q1.enqueue(10);
		q1.enqueue(15);
		q1.enqueue(20);
		q1.display();
		System.out.println();
		System.out.println("the removed element is " + q1.dequeue());
		System.out.println("after deleting the element");
		q1.display();
		System.out.println();
		
		System.out.println("the size is "+q1.size());
		q1.dequeue();
		q1.display();
		System.out.println();
		q1.enqueue(25);
		q1.display();
		q1.enqueue(56);
		q1.display();
		q1.enqueue(6);
		q1.display();
		System.out.println();
		System.out.println(" the removed is element is " + q1.dequeue());
		System.out.println(" the removed is element is " + q1.dequeue());
		System.out.println(" the removed is element is " + q1.dequeue());
		System.out.println(" the removed is element is " + q1.dequeue());
		q1.display();
		System.out.println(" the removed is element is " + q1.dequeue());
		System.out.println(" the removed is element is " + q1.dequeue());
	
		
		

	}
	public void enqueue(int data) {
		{		
		if(size < capacity ) {
		if(front == -1 && rear == -1) {
			front = (front + 1) % capacity;
			rear = (rear + 1) % 5;
			arr[rear]=data;
		}
		else{
			rear = (rear + 1) % capacity;
			arr[rear] = data;
			
		}
		System.out.println();
		size++;
		} 
		else {
			System.out.println("the queue is full so no" + data + " is not inserted into the queue");
		}
		}
	}
	public int dequeue() {
		if(size > 0) {
		int data = arr[front];
		front = (front + 1)%capacity;
		size--;
	
		System.out.println();
		return data;}
		else {
			System.out.println("the queue is empty");
			return -1;
		}
		
		
	}
	public boolean isempty() {
		if(size == 0) {
			return true;
		}else
			return false;
		
	}
	public boolean isfull() {
		if(size == capacity - 1) return true;
		else return false;
	}
	public int size() {
		return size;
	}
	public void display() {
		int i=front;
		for(int j=0;j<size;j++) {
			System.out.print(arr[(i+j) % capacity] + "  ");
		}
	}
}
