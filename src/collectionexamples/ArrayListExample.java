package collectionexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
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
		
		//for each
		for(Integer elem:list) {
			System.out.println(elem);
			
		}
		
		//ittreator
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
