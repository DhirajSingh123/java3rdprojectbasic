package collectionexamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
	
	public static void main(String[] args) {
		Queue<Integer> obj = new LinkedList<>();
		obj.offer(555);
		obj.offer(15);
		obj.offer(50);
		
		System.out.println(obj);
		
		System.out.println(obj.poll());
		System.out.println(obj);
		
	}

}
