package com.yml.stackqueuelinkedlist;

public class Queue <K> {
	private final LinkedList<K> linkedList;
	
	public Queue() {
		linkedList = new LinkedList<K>();
	}
	
	public void enqueue(K element) {
		linkedList.append(element);
	}
	
	public void printQueue() {
		System.out.println("\nQueue: ");
		linkedList.print();
	}
	
	public K dequeue() {
		K data = linkedList.pop();
		return data;
	}
}
