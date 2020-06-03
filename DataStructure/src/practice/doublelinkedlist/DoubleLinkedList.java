package practice.doublelinkedlist;

public class DoubleLinkedList {
	
	Node head, tail;
	
	public void insertAtFirstPost(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		if(this.head != null) {
			this.head.setPrevNode(newNode);
		}
		this.head = newNode;
	}
	
	public void inserAtLastPost(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = this.tail = newNode;
			this.head.setPrevNode(null);
			this.tail.setNextNode(null);
		}
		else {
			newNode.setPrevNode(this.tail);
			this.tail.setNextNode(newNode);
			this.tail = newNode;
			this.tail.setNextNode(null);
		}
	}
	
	public void printList() {
		if(this.head == null) {
			return;
		}
		
		Node currNode = this.head;
		while(currNode != null) {
			System.out.print(currNode.getData()+" ");
			currNode = currNode.getNextNode();
		}
	}

}
