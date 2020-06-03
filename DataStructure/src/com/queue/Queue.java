package com.queue;

public class Queue {
	
	private int array[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	public Queue(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.rear = -1;
		this.front = 0;
		this.count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isFull() {
		return (size() == capacity);
	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("queue is full.");
			System.exit(1);
		}
		System.out.println("Inserting: "+item);
		array[++rear] = item;
		count++;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty.");
			System.exit(1);
		}
		System.out.println("Removing first element");
		front++;
		count--;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty.");
			System.exit(1);
		}
		return array[front];
	}

}
