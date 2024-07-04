package demo.sample4;

public class App10_49 {

	String a;
	boolean b;
	double c;

	public App10_49() {
		this.a = new String("sample");
		this.b = new Boolean(true);
		this.c = 100;
	}

	public String toString() {
		return a + ":" + b + ":" + c;
	}

	public static void main(String[] args) {
		App10_49 s = new App10_49();
		s.a = "sample";
		s.b = true;
		s.c = 100;
		System.out.println(s);
	}
}
