package com.doubleLinkedlist;


public class DoubleLinkedList {
	
	private DoubleLinkedNode head;
	
	public void insertAtHead(int data) {
		DoubleLinkedNode newNode = new DoubleLinkedNode(data);
		newNode.setNextNode(this.head);
		if(this.head != null) {
			this.head.setPrevNode(newNode);
		}
		this.head = newNode;
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		int length = 0;
		DoubleLinkedNode current = this.head;
		while(current != null) {
			length ++;
			current = current.getNextNode();
		}
		return length;
	}
	
	public void printList() {
		DoubleLinkedNode n = this.head;
		
		while(n.getNextNode()!= null) {
			System.out.print(n.getData()+  " ");
			n = n.getNextNode();
		}
	}
	
	public void deleteNode(int val) {
		DoubleLinkedNode n = this.head;
		while(n.getNextNode()!= null) {
			if(n.getData() == val) {
				n.getPrevNode().setNextNode(n.getNextNode());
				break;
			}
		}
		printList();
	}
	
	
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		DoubleLinkedNode n = this.head;
		sb.append("node data:  ");
		sb.append(n);
		sb.append("\n");
		n = n.getNextNode();
		return sb.toString();
	}
}
