package java8features;

import java.util.function.Function;

public class FunctionInterfaceExample {
	
	public static void main(String[] args) {
		
		Function<Integer, String> getOutPut =t-> t*10+" Hello";		
		System.out.println(getOutPut.apply(34));
		
		
	}

}
