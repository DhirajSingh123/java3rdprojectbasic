package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello";
//		System.out.println(supplier.get());

		List<String> list = Arrays.asList();
		
		
    System.out.println(list.stream().findAny().orElseGet(supplier));
    
    
    //we can write this way as well
    System.out.println(list.stream().findAny().orElseGet(supplier = () -> "Hello Bro"));
    
    list.stream().findAny().orElseGet(supplier = () -> "Hello Bro");
	}

}
