package java8features;

interface A {

	default void show() {
		System.out.println("I java 8 Interface");
	}
}

public class NewInterface implements A {

	public static void main(String[] args) {
		A obj = new NewInterface();
		obj.show();

	}

}
