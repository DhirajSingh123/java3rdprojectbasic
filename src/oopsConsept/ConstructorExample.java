package oopsConsept;

class Test1 {

	Test1() {

		System.out.println(" constructor Test1");
	}

	void getName() {
		System.out.println("I am Test1");
	}
}

class Test2 {
	static int count = 0;

	Test2() {
		count++;

		System.out.println(" constructor TestB" + count);
	}

	Test2(String name) {
		this();
		System.out.println(" constructor" + name);
	}

	static void getName() {
		System.out.println("I am Test B");
	}
}

public class ConstructorExample {
	public static void main(String[] args) {

		Test2 t2 = new Test2(" parametric Test1 class");

		System.out.println(Test2.count);

	}

}
