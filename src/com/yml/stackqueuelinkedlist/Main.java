package com.yml.stackqueuelinkedlist;

public class Main {

	public static void main(String[] args) {
		/*
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
		
		*/
		
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.printQueue();
		
		System.out.println("\nDequeue element : "+queue.dequeue());
		queue.printQueue();
		
		System.out.println("\nDequeue element : "+queue.dequeue());
		queue.printQueue();
		
		System.out.println("\nDequeue element : "+queue.dequeue());
		System.out.println();
		System.out.println("\nDequeue element : "+queue.dequeue());
		
	}

}
