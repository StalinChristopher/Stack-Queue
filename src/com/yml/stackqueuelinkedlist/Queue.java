package com.yml.stackqueuelinkedlist;

public class Queue <K> {
	private final LinkedList linkedList;
	
	public Queue() {
		linkedList = new LinkedList();
	}
	
	public void enqueue(K element) {
		linkedList.append(element);
	}
	
	public void printQueue() {
		System.out.println("\nQueue: ");
		linkedList.print();
	}
}
