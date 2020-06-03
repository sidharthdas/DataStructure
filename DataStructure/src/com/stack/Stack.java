package com.stack;

public class Stack {
	
	private int array[];
	private int capacity;
	private int top;
	
	public Stack(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int item) {
		array[++top] = item;
	}
	
	public int pop() {
		return array[top--];
	}
	
	public int peek() {
		return array[top];
	}

}
