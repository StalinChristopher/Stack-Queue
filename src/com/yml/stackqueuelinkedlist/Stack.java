package com.yml.stackqueuelinkedlist;

public class Stack <K> {
	private final LinkedList<K> linkedList;
	
	public Stack() {
		linkedList = new LinkedList<K>();
	}
	
	public void push(K element) {
		linkedList.push(element);
	}
	
	public void printStack() {
		System.out.println("\nStack: ");
		linkedList.print();
	}
	
	public K pop() {
		K data = linkedList.pop();
		return data;
	}
	
	public K peek() {
		K data = linkedList.peek();
		return data;
	}
}
