package logicalProgramming;

public class AramstrongNo {

	public static void main(String[] args) {

		
//		Note: 153, 370 is aramstrong no
		int no = 370, a, temp = 0;
		int originalNo = no;

		while (no > 0) {
			a = no % 10;

			System.out.println(a);

			temp = temp + (a * a * a);
			no = no / 10;

		}

		if (temp == originalNo) {
			System.out.println("Given no is aramstrong no");

		} else {
			System.out.println("Not a aramstrong no");
		}

	}

}
