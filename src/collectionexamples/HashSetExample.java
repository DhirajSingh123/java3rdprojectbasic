package collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		set.add(32);
		set.add(2);
		set.add(65);
		set.add(21);
		set.add(65);

		
		System.out.println(set);
	}

}
