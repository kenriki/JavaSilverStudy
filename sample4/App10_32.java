package demo.sample4;

/**
 * 実行の構成から引数に「Hello」をいれて実行する
 */
public class App10_32 {

	public static void main(String[] args) {
		if (args[0].equals("Hello") ? false : true) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
