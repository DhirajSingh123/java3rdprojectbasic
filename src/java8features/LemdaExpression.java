package java8features;

import java.util.ArrayList;
import java.util.List;

public class LemdaExpression {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(44);
		list.add(32);
		list.add(54);
		list.add(65);
		
		list.forEach((n)->{

			System.out.println(n);
		});
		
		
		
	}

}
