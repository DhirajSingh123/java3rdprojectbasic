interface Vechle {

	void carRun();
}

class Car implements Vechle {

	@Override
	public void carRun() {
		System.out.println("Car Started but old process using class");

	}

}

public class AnonymsClassExample {

	public static void main(String[] args) {

		// Old way to use class and implements interface
		Car obj1 = new Car();
		
		obj1.carRun();

		// using anonyms class: class has no name
		Vechle obj2 = new Vechle() {

			@Override
			public void carRun() {
				System.out.println("Anonyms class car started");

			}
		};

		obj2.carRun();

		// using lembda expression
		Vechle obj3 = () -> System.out.println("using lembda expression class car started");

		obj3.carRun();

	};

}
