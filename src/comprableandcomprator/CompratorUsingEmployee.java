package comprableandcomprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getRollNo() {
		return id;
	}

	public void setRollNo(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [rollNo=" + id + ", name=" + name + "]";
	}
}

public class CompratorUsingEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(102, "Manne"));
		employeeList.add(new Employee(101, "Dhiraj"));
		employeeList.add(new Employee(104, "Ankit"));
		employeeList.add(new Employee(102, "Atal"));
		employeeList.add(new Employee(105, "Atal"));

		Collections.sort(employeeList, new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				if (o1.name.equals(o2.name)) {
					return o1.id - o2.id;
				} else {
					return o1.name.compareTo(o2.name);
				}

			}

		});
		employeeList.forEach(System.out::print);

	}

}


	
	


