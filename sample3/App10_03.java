package demo.sample3;

public class App10_03 {
	public static void main(String[] args) {

		String[] array = { "abcde", "fgh", "ijk" };
		String[] array2 = new String[3];

		int i = 0;

		try {
			for (String s : array) {
				array2[i] = s.substring(1, 4);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

		for (String s : array2) {
			System.out.println(s);
		}
	}
}
