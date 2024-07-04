package demo.sample3;

/**
 * 後置インクリメントのタイミング
 */
public class App10_16 {

	public static void main(String[] args) {
		int num = 9;
		if (num++ < 10) {
			System.out.println(num);
		} else {
			System.out.println("B");
		}
	}

}
