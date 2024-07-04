package demo.sample7;

/**
 * continue; とbreak; の仕組み
 */
public class App10_70 {

	public static void main(String[] args) {
		int num = 1;
		x: for (int i = 0; i < 3; i++) {
			y: for (int j = 0; j < 5; j++) {
				if (j == 1) {
					continue;
				}
				if (j == 3) {
					break x;
				}
				num += i;
			}
		}
		System.out.println(num);

	}

}
