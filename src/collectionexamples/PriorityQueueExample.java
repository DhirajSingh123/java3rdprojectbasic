package collectionexamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		Queue<Integer> priorityQueue = new PriorityQueue<>(); 
		
		priorityQueue.offer(32);
		priorityQueue.offer(12);
		priorityQueue.offer(11);
		
		System.out.println(priorityQueue);
		
	}

}
