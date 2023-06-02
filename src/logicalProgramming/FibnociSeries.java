package logicalProgramming;

public class FibnociSeries {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1, userInput = 5, temp;

		System.out.println(num1);
		System.out.println(num2);

		for (int i = 1; i < userInput; i++) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.println(temp);
			temp = 0;

		}

	}

}
