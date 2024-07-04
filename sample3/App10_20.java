package demo.sample3;

public class App10_20 {

	public static void main(String[] args) {
		String[][] array = new String[2][];
		array[0] = new String[2];
		array[1] = new String[5];

		int i = 97;
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array.length; b++) {
				array[a][b] = "" + i;
				i++;
			}
		}
		for (String[] tmp : array) {
			for (String s : tmp) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

}
