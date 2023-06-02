package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamApiInterFace {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		for (int i = 1; i < 19; i++) {
			 
			list.add(i);
			
		}
		
//		System.out.println(list);
//		
//		list.stream().forEach((n)->{
//			System.out.println(n);
//		});
		
		//or
		
		
//		list.stream().forEach(System.out::println);
//		
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
	}

}
