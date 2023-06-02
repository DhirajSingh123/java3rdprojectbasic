package logicalProgramming;

public class PalindromeNoExample {

	public static void main(String[] args) {

		int no = 121;
		int temp = 0, reverse = 0, oldNo = no;

		while (no > 0) {

			int reminder = no % 10;

			reverse = reverse * 10 + reminder;
			no = no / 10;

		}

		if (reverse == oldNo) {
			System.out.println("Given no is palindrome");
		}

	}

}
