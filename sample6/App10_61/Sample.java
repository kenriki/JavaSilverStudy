package demo.sample6.App10_61;

/**
 * コンパイルエラーとなることを確認する
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	到達不能コード

	at demo.sample6.App10_61.Sample.main(Sample.java:22)

 */
public class Sample {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int key = 3;
		int cnt = 0;
		for (int i : array) {
			if (i != key) {
				continue;
				//cnt++;
			}
		}

		System.out.println(cnt);

	}

}
