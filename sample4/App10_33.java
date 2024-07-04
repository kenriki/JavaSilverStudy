package demo.sample4;

/**
 * コンパイルエラーになることを確認する
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	short から Long へキャストすることはできません
	long から String へキャストすることはできません

	at demo.sample4.App10_33.main(App10_33.java:8)
 */
public class App10_33 {

	public static void main(String[] args) {
		short s1 = 10;
		Integer s2 = 20;
//		Long s3 = (Long) s1 + s2;
		Long s3 = (long)((int) s1 + s2);
//		String s4 = (String) (s3 + s2);
		String s4 = Long.toString(s3 + (long)s2);
		System.out.println(s4);
	}
}
