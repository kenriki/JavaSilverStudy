package demo.sample4;

/**
 * コンパイルエラーとなることを確認する
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	処理されない例外の型 Exception
	処理されない例外の型 Exception

	at demo.sample4.App10_31.main(App10_31.java:15)
 */
public class App10_31 {

	void test() throws Exception {
		System.out.println("test");
	}

	void hoge() throws Exception {
		System.out.println("hoge");
	}

	public static void main(String[] args) throws Exception {
		App10_31 sampleRun = new App10_31();
//		sampleRun.test();
//		sampleRun.hoge();
		sampleRun.test();
		sampleRun.hoge();
	}
}
