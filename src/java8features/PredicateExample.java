package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class SmartCity {
	public String name;
	public int costly;

	@Override
	public String toString() {
		return "SmartCity [name=" + name + ", costly=" + costly + "]";
	}

}

public class PredicateExample {

	public static void main(String[] args) {

		SmartCity city1 = new SmartCity();

		city1.name = "Pune";
		city1.costly = 20000;

		SmartCity city2 = new SmartCity();

		city2.name = "Bangalore";
		city2.costly = 25000;

		List<SmartCity> citylist = new ArrayList<>();
		citylist.add(city1);
		citylist.add(city2);

		/*
		 * Both working fine
		 */
//		list.stream().filter(t -> t % 2 == 0).forEach(System.out::println);

//		list.stream().filter(t -> t % 2 == 0).forEach(x->{
//			System.out.println(x);
//		});

		citylist.stream().filter(t -> t.costly > 21000).forEach(x -> {
			System.out.println(x);
		});

		List<SmartCity> city = citylist.stream().filter(t -> t.costly > 21000).collect(Collectors.toList());

		for (SmartCity smartCity : city) {

			System.out.println(smartCity);

		}
	}

}
