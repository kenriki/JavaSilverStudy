package demo.sample4;

/**
 * コンパイルエラーになる問いですが、自力で直してみること
 */
public class App10_26 {

	public static void main(String[] args) {
		int x = 10;
		int a = x++;
		int b = ++x;
		int c = x++;
		//int d = (a < b) ? (a < c) ? a : (b < c) ? b : c; // コンパイルエラーになるやつ
		int d = (a < b) ? ((a < c) ? a : ((b < c) ? b : c)) : c;
		System.out.println(d);

	}
}
