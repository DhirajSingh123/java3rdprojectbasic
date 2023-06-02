package collectionexamples;

import  java.util.*;

public class TreeSetExample {
	
	public static void main(String[] args) {
		Set<Integer> set =  new TreeSet<>();
		
		set.add(32);
		set.add(2);
		set.add(65);
		set.add(21);
		set.add(65);

		
		System.out.println(set);
	}

}
