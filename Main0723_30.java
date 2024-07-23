package demo;

public class Main0723_30 {

	public static void main(String[] args) {
		String text = " Kenmochi Riki";
		text = text.trim();
		if (text.indexOf("R", 9) == 9 && text.contains("R")) {
			System.out.println("Found!");
		}

	}

}
