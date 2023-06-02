package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
/*
 * Treditional way to implement consumer
 */
//		Consumer<Integer> consumer = no -> System.out.println(no);
//		consumer.accept(56);

		
		/*
		 * using Stream Api for each internally consist accept method
		 */
		List<Integer> list = Arrays.asList(1, 14, 3, 5, 45, 4);

		// x we can replace any alphabet
		list.stream().filter(x -> x > 5).forEach(x -> System.out.println(x));

	}

}
