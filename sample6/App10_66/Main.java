package demo.sample6.App10_66;

/**
 * コンパイルエラーとなることを確認する
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *	B から C へキャストすることはできません
 *
 *	at demo.sample6.App10_66.Main.main(Main.java:7)
 *
 */
public class Main {
	public static void main(String[] args) {
		A a = new B();
		B b = (B) a;
		//C c = (C) b;
		b.hello();
	}
}
