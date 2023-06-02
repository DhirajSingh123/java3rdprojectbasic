package java8features;

import java.util.ArrayList;
import java.util.Optional;

public class MinMaxUsingStream {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(14);
		list.add(5);
		list.add(41);
		list.add(24);
		list.add(3);

		int maxNo = list.stream().max((x, y) -> x - y).get();

		System.out.println("MaxNo::::::::"+maxNo);
		
		int minNo = list.stream().min((x, y) -> x - y).get();

		System.out.println("MinNo::::::::"+minNo);

	}

}
