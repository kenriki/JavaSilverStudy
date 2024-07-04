package demo.sample4;

/**
 * コンパイルエラーとなることを確認する
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	ローカル変数 x が初期化されていない可能性があります
	ローカル変数 a が初期化されていない可能性があります
	ローカル変数 b が初期化されていない可能性があります

	at demo.sample4.App10_38.main(App10_38.java:17)

 */
public class App10_38 {

	static double total;

	int a = 2, b = 3;

	public static void main(String[] args) {
		double x=0, a=0, b=0;

		if (total == 0) {
			a = 3;
			b = 4;
			x = 0.5;
		}
		total = x * a * b;
		System.out.println(total);
	}
}
