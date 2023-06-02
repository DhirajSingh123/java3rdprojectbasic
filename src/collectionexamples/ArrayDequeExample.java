package collectionexamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		ArrayDeque<Integer> obj = new ArrayDeque<Integer>();
		
		obj.offer(54);
		obj.offerFirst(12);
		obj.offer(11);
		obj.offerLast(1);
		
		System.out.println(obj);
		
		System.out.println(obj.pollLast());
		
		System.out.println(obj);
		
		
	
	}

}
