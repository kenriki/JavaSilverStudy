package demo;

public class Main0723_33 {

	static int i = 0;

	public static void main(String... args) {
		int[] array = { 5, 7, 11, 13, 15 };

		operate(array);
	}

	private static void operate(int... arr) {
		do {
			System.out.print(arr[i] + " ");
		} while (arr[i] <= 11 | arr[i++] < 11);
	}

}
