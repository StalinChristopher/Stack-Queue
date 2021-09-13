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
		System.out.println("Stack: ");
		linkedList.print();
	}
}
