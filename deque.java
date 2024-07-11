package assignment;

public class dequeasdll {
	Node head,tail;
	static int size=0;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	public void addfront(int data) {
		Node n1 = new Node(data);
		if(isempty()) {
			head = tail = n1;
		}else {
			n1.next=head;
			head.prev=n1;
			head=n1;
		}
		size++;
		System.out.println();
		
	}
	public void addrear(int data) {
		Node n1 = new Node(data);
		if(isempty()) {
			head = tail = n1;
		}else {
			tail.next=n1;
			n1.prev=tail;
			tail=n1;
		}
		size++;
		System.out.println();
		
	}
	public void removefront() {
		if(isempty()) {
			System.out.println("the queue is empty, so deletion not possible");
		}else {
			head = head.next;
			if(head != null) head.prev=null;
			else tail=null;
		}
		size--;
		System.out.println();
		
	}
	public void removerear() {
		if(isempty()) {
			System.out.println("the queue is empty, so deletion not possible");
		}else {
			tail = tail.prev;
			if(tail != null) tail.next=null;
			else head=null;
		}
		size--;
		System.out.println();
		
	}
	public int size() {
		return size;
	}
	public void display() {
		if(isempty()) System.out.println(" the queue is empty idiot");
	else {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + "  ");
			curr=curr.next;
		}
		System.out.println();
		
	}
	}
	public boolean isempty() {
		if(size == 0) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dequeasdll d1 = new dequeasdll();
		d1.addfront(10);
		d1.addfront(20);
		d1.addrear(10);
		d1.addfront(50);
		d1.removerear();
		d1.removerear();
		d1.removerear();
		d1.removerear();
		d1.display();

	}

}
