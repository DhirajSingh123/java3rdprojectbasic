package exceptioHandling;

import java.io.IOException;

public class ThrowsException {
//	/defining a method  
	public static int divideNum(int m, int n) throws ArithmeticException {

		int div = m / n;
		return div;

	}

	// main method
	public static void main(String[] args) {
		ThrowsException obj = new ThrowsException();
		try {
			System.out.println(obj.divideNum(45, 0));
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("not possible to devide by zero");
		}

		System.out.println("Rest of the code..");
	}

}
