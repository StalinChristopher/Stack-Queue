package com.yml.stackqueuelinkedlist;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		
		System.out.println("\nPeek: "+stack.peek());
		stack.pop();
		stack.printStack();
		System.out.println("\nPeek: "+stack.peek());
		stack.pop();
		stack.printStack();
		System.out.println("\nPeek: "+stack.peek());
		stack.pop();
		stack.printStack();
		System.out.println("\nPeek: "+stack.peek());

	}

}
