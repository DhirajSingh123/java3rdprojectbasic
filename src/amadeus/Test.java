package amadeus;

public class Test {
	public static void main(String[] args) {

		String txt = "Enable FaceTime Did a recent iOS update log you out from FaceTime on iPhone  log you out from FaceTime";

		int count = 0;
		for (int i = 0; i < 2; i++) {
			String temp1[] = txt.split(" ");

			for (int j = 0; j < temp1.length; j++) {

				for (int j2 = 0; j2 < temp1.length; j2++) {

					if (temp1[j].equals(temp1[j2])) {
						count++;
					}
				}
				if (count > 0) {
					System.out.println("keyName:: " + temp1[j] + " " + "Count:: " + count);
				}
				count = 0;
			}
		}
	}

}
