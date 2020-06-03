package com.doubleLinkedlist;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList integer = new DoubleLinkedList();
		integer.insertAtHead(8);
		integer.insertAtHead(10);
		integer.insertAtHead(20);
		integer.insertAtHead(30);
		integer.insertAtHead(40);
		integer.insertAtHead(50);
		
		System.out.println(integer.length());
		integer.printList();
		
		integer.deleteNode(8);
		
		

	}

}
