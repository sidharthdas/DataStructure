package practice.linkedlist;


class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

}

public class LinkedList {
	Node head = null;

	public LinkedList insert(LinkedList l, int data) {
		Node newNode = new Node(data);
		if (l.head == null) {
			head = newNode;
		} else {
			Node lastNode = l.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		return l;
	}

	public void printList(LinkedList list) {
		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}

	}
	
	public static void main(String[] args) {
		
LinkedList list = new LinkedList();
		
		list = list.insert(list, 1);
		list = list.insert(list, 2);
		list = list.insert(list, 3);
		list = list.insert(list, 4);
		list = list.insert(list, 5);
		list = list.insert(list, 6);
		list = list.insert(list, 7);
		list = list.insert(list, 8);
		
		System.out.println("LinkedList is: ");
		list.printList(list);
	}
}