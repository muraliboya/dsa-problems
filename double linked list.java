//package assignment;
//
//public class doublelinkedlist {
//	Node head;
//	Node tail;
//	class Node{
//		Node next;
//		Node prev;
//		String data;
//		Node(String data){
//			this.data=data;
//		}
//	}
//	public void addatfirst(String data) {
//		Node n = new Node(data);
//		if(head == null) {
//			head=n;
//			tail=n;
//		}else {
//			n.next=head;
//			head.prev = n;
//			head = n;
//		}
//		
//		System.out.println();
//		
//	}
//	public void addatmiddle(int pos, String data) {
//		int count=1;
//		
//		Node n = new Node(data);
//		if(pos < 1) System.out.println(" cannot insert enter valid value");
//		else if(pos == 1) {
//			addatfirst(data);
//		}else {
//			Node curr = head;
//			Node ncurr=curr.next;
//			while(count < pos - 1 && curr != null) {
//				curr = curr.next;
//				ncurr=ncurr.next;
//				count ++;
//			}
//			curr.next=n;
//			n.next=ncurr;
//			
//			
//		}
//		System.out.println();
//	}
//	public void addatlast(String data) {
//		Node n = new Node(data);
//		if(tail == null) addatfirst(data);
//		else {
//			tail.next=n;
//			n.prev=tail;
//			tail=n;
//		}
//		
//		System.out.println();
//	}
//	public void print() {
//		Node curr = head;
//		while(curr != null) {
//			System.out.print(curr.data + "   ");
//			curr = curr.next;
//		}
//	}
//	
//	public void printlast() {
//		Node curr = tail;
//		while(curr != null) {
//			System.out.print(curr.data + "   ");
//			curr = curr.prev;
//		}
//	}
//	public void removeatfirst() {
//		if(head == null || tail == null) System.out.println(" no element is present in it;");
//		else {
//			head = head.next;
//			head.prev=null;
//		}
//	}
//	public void removeatlast() {
//		if(head == null || tail == null) System.out.println(" no element is present in it");
//		else if (head == tail){
//			head =null;
//			tail=null;
//		}else {
//			Node prevtail = tail.prev;
//			prevtail.next = null;
//			tail.prev=null;
//			tail = prevtail;
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		doublelinkedlist l1 = new doublelinkedlist();
//		l1.addatmiddle(1, "5");
//		l1.addatmiddle(2, "10");		
//		l1.addatmiddle(3, "15");
//		l1.removeatfirst();
//		l1.removeatlast();
//		l1.print();
//
//	}
//
//}





package assignment;

public class doublelinkedlist {
    Node head;
    Node tail;
    static int size;

    class Node {
        Node next;
        Node prev;
        String data;

        Node(String data) {
            this.data = data;
        }
    }

    public void addatfirst(String data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            size++;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
            size++;
        }
        
    }

    public void addatmiddle(int pos, String data) {
        Node n = new Node(data);
        if (pos < 1) {
            System.out.println("Cannot insert at invalid position");
        } else if (pos == 1) {
            addatfirst(data);
        } else {
            Node curr = head;
            int count = 1;
            while (count < pos - 1 && curr != null) {
                curr = curr.next;
                count++;
            }
            if (curr == null) {
                System.out.println("Position out of bounds");
                return;
            }
            Node ncurr = curr.next;
            curr.next = n;
            n.prev = curr;
            n.next = ncurr;
            if (ncurr != null) {
                ncurr.prev = n;
            }
            size++;
        }
    }

    public void addatlast(String data) {
        Node n = new Node(data);
        if (tail == null) {
            addatfirst(data);
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
            size++;
        }
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "   ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void printlast() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + "   ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public void removeatfirst() {
        if (head == null) {
            System.out.println("No element to remove at the beginning");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // if head is null, list becomes empty
            }
        }
    }

    public void removeatlast() {
        if (tail == null) {
        	
            System.out.println("No element to remove at the end");
        } else {
        	tail = tail.prev;
        	if(tail != null) {
        		tail.next=null;
        	}else {
        		head = null;
        	}
            }
    }

    public static void main(String[] args) {
        doublelinkedlist l1 = new doublelinkedlist();
        l1.addatmiddle(1, "5");
        l1.addatmiddle(2, "10");
        l1.addatmiddle(3, "15");
        l1.removeatfirst();
        l1.removeatlast();
        l1.print();
    }
}

