package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiOtherExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(14);
		list.add(5);
		list.add(41);
		list.add(24);
		list.add(3);

		// First Way of Filter
		list.stream().filter(x -> x < 14).forEach(System.out::println);

		// First Way of Filter
		list.stream().filter(x -> x < 14).forEach(res -> {
			System.out.println("Same response different way:::::::" + res);
		});

		// Map is use basically for internally operation
		list.stream().map(x -> x * 2).forEach(System.out::println);

		
		
		// Sorted is use basically for internally operation by defaukt is returen in ascending order
	
		
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		// if you want in descending order then you have to apply
		
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		for (int i =sortedList.size()-1; i >=0 ; i--) {
			
			System.out.println(sortedList.get(i));
			
		}
		
		
		
		

	}

}
