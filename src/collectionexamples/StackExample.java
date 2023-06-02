package collectionexamples;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(45);
		stack.push(65);
		stack.push(23);
		stack.push(4);
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		
		
	}

}
