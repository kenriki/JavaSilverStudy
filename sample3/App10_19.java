package demo.sample3;

/**
 * 三項演算子の考え方
 */
public class App10_19 {

	public static void main(String[] args) {
		double a = 0;
		int b = 90;

		a = (b >= 90) ? 0.5
		  : (b > 80) ? 0.2
		  : 0;

		System.out.println(100 * a);
	}

}
