package designpattern;

class Single {

	/*
	 * @Dhiraj Singh first step create own class object and put static keyword
	 */
	static Single obj = new Single();

	// second step make constructor private
	private Single() {
		System.out.println("Hello I ma single ton");

	}

	// Third step create getInstance method name should be anything and return
	// object
	public static Single getInstance() {
		return obj;

	}

}

public class SingleTonExample {

	public static void main(String[] args) {
		Single.getInstance();
		Single.getInstance();

	}

}
