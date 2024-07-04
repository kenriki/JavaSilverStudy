package demo.sample5;

public class App10_59 {

	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			System.out.println("A");
		}
	}

	public static void test() {
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("B");
		}

	}

}
