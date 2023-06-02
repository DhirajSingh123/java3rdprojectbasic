package java8logicalquestion;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int id;
	String name;
	int salary;
}

public class EmployeeIDs {

//	filter employees whose age greater than 15 and store only ids

	public static void main(String[] args) {
		List<Employee> emp = List.of(new Employee(1, "Dhirah", 1000), new Employee(2, "raj", 2000),
				new Employee(3, "Anki", 900));

		List<Integer> list = emp.stream().filter(x -> x.salary > 1950).map(y -> y.id).collect(Collectors.toList());

		System.out.println(list);
	}

	@Override
	public String toString() {
		return "EmployeeIDs [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
