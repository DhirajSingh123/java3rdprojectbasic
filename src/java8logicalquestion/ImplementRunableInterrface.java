package java8logicalquestion;

public class ImplementRunableInterrface {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			System.out.println("Hello");
		});
		t.start();
	}

}
