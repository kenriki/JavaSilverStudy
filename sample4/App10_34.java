package demo.sample4;

/**
 * 変数のスコープについて
 */
public class App10_34 {
	String val = "7";

	public void doStuff(String str) {
		int num = 0;
		try {
			String val = str;
			num = Integer.parseInt(val);
		} catch (NumberFormatException e) {
			System.out.println("error");
		}
		System.out.println("val=" + val + ",num=" + num);
	}

	public static void main(String[] args) {
		new App10_34().doStuff("9");
	}
}
