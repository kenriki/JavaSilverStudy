package demo.sample3;

/**
 * 実行の構成で引数をセットして実行する
 * 
 */
public class App10_04 {
	public static void main(int[] args) {
		System.out.println("A");
	}

	public static void main(Object[] args) {
		System.out.println("B");
	}

	public static void main(String[] args) {
		System.out.println("C");
	}
}