package taufeek;

class A {
	public static void show() {

		System.out.println("calss A show method");
	}
	
	public static void getHii() {

		System.out.println("Hii method in main class");
	}
	
	
	//we can overloading static method
	public void getHii(String message) {

		System.out.println("Hii parametric method in main class:::::::"+message);
	}
}

public class CantOverrideStaticMethod extends A {
	
	
	
	//throwing error because we can't override static method but we can ovverire if we erite satic in child class as well

// i.e::	public static void show() {
	
	public  static void show() {

		System.out.println("calss CantOverrideStaticMethod show method");
	}
	
	public static void getHello() {

		System.out.println("hello method in main class");
	}

	public static void main(String[] args) {
		A obj = new CantOverrideStaticMethod();
		obj.show();
		obj.getHii("uttam");

	}

}
