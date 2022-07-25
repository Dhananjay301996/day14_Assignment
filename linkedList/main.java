package linkedList;

public class main {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	

	/* Add - First Node
	 */
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	/*
	 * Add Last Node
	 */
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	/*
	 * Print List 
	 */
	
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		
		while(currNode != null) {
			
			System.out.print(currNode.data +"->");
			
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
	}
	
	
	/*
	 * Delete First	
	 */
		
	public void deleteFirst() {
		if (head == null) {
			System.out.println("The list is Empty");
			
		}
		
		head = head.next;
	}
	
	/*
	 * Delete Last
	 */
	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is Empty");	
		}
		if (head.next == null) {
			head = null;
		}

		Node secondlast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondlast = secondlast.next;
		}
		secondlast.next = null;
		
	}

	public static void main(String[] args) {
		main list = new main();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.printList();
		
		list.addLast(99);
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();

	}

}
