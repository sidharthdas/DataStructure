package com.linkedlist;

class Node{
	int data;
	Node next;
	
	public Node (int data) {
		this.data = data;
	}
}

public class LinkedList {
	
	Node head = null;
	
	public LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		if(list.head== null) {
			list.head = newNode;
		}else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	
	public void printList(LinkedList list) {
		Node currNode = list.head;
		while(currNode != null) {
			System.out.print(currNode.data+ " ");
			currNode = currNode.next;
		}
		
	}
	public void deleteANode(LinkedList l,int val) {
		if(l.head == null) {
			return;
		}
		Node currNode = l.head;
		while(currNode != null) {
			if(currNode.data == val) {
				
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
