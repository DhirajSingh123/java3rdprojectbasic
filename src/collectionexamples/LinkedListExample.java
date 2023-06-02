package collectionexamples;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(97);
		list.add(50);
		list.add(54);
		list.add(21);
		list.add(43);

		System.out.println(list);
		System.out.println(list.get(0));
		list.add(2, 7);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}


}
