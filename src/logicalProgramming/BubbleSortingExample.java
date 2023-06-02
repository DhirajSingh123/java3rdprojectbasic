package logicalProgramming;

public class BubbleSortingExample {

	public static void main(String[] args) {

		int arr[] = { 12, 13, 5, 34, 2 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] > arr[i]) {

					temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}

	}

}
