package comprableandcomprator;
import java.util.*;

class Student implements Comparable<Student> {
	int rollNo;
	String name;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public int compareTo(Student obj) {
		if (this.rollNo > obj.rollNo)
			return 1;
		else if (this.rollNo < obj.rollNo) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}

public class ComprableExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(103, "Atal"));
		studentList.add(new Student(101, "Dhiraj"));
		studentList.add(new Student(104, "Ankit"));
		studentList.add(new Student(102, "manne"));
		
		System.out.println(studentList);

		Collections.sort(studentList);

		System.out.println(studentList);

	}

}
