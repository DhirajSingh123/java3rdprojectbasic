package logicalProgramming;

public class ReverseNameSamePostion {

	public static void main(String[] args) {

		String name = "Dhiraj Singh";

		String splitWord[] = name.split(" ");
		for (int i = 0; i < splitWord.length; i++) {

			String[] na = splitWord[i].split("");

			for (int j = na.length - 1; j >= 0; j--) {
				System.out.print(na[j]);

			}
			System.out.print(" ");

		}

	}

}
