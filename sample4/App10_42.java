package demo.sample4;

public class App10_42 {

	public static void main(String[] args) {
		String[] array = { "A", "B", "C", "D" };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (array[i].equals("C")) {
				continue;
			}
			System.out.println("end");
			break;
		}
	}
}
