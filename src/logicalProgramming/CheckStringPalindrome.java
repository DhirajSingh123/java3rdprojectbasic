package logicalProgramming;

public class CheckStringPalindrome {

	public static void main(String[] args) {

		String name = "MOM";
		String temp = "";

		String[] splitName = name.split("");

		for (int i = splitName.length - 1; i >= 0; i--) {
			temp = temp + splitName[i];

		}
		if (name.equals(temp)) {
			System.out.println("its palindrome");
		} else {
			System.out.println("its not a palindrome");
		}

	}

}
