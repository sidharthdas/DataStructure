package com.queue;

public class QueueImpl {
	
	public static void main(String[] args) {
		
		Queue queue = new Queue(3);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.dequeue();
		System.out.println(queue.size());
	}

}
