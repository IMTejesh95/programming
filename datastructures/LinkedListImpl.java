package programming.datastructures;
 



class LinkedList{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data; 
			this.next = null;
		}
	}
	
	public void addLast( int data) {
		
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		}else {
			
			Node lastNode = this.head;
			while( lastNode.next != null ) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		}else {
			Node currentNode = this.head;
			newNode.next = currentNode;
			this.head = newNode;
		}
	}
	
	public void printList() {
		Node  node = this.head;
		while( node != null ) {
			System.out.print( node.data + " --> ");
			node = node.next;
		}
	}
	
	public void deleteNode(int data) {
		
			Node lastNode = this.head;
			if(lastNode != null && lastNode.data == data) {
				this.head = lastNode.next;
				return;
			}
				
			Node prevNode = null;
			while( lastNode != null && lastNode.data != data) {
				prevNode = lastNode;
				lastNode = lastNode.next;
			}
			
			if(lastNode != null) {
				prevNode.next = lastNode.next;
				return;
			}else {
				System.out.println(data + " not found");
				return;
			}
	}
	
}



class DoublyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public void printList() {
		Node  node = this.head;
		while( node != null ) {
			System.out.print( node.data + " --> ");
			node = node.next;
		}
	}
	
	//	Add first
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		}else {
			this.head.prev = newNode;
		}
	}
	
}


public class LinkedListImpl {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		
		list.addFirst(0);
		list.addFirst(-1);
		
		list.deleteNode(2);
		
		list.printList();
		
		
		
			
		
	}

}



