package demo.sample4;

public class App10_50 {
	
	public static void test(Integer a, Integer b) {
		System.out.println("A");
	}
	
	public static void test(double a, double b) {
		System.out.println("B");
	}
	
	public static void test(float a, float b) {
		System.out.println("B");
	}

	public static void test(int a, int b) {
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		test(10, 20);
		test(10.0, 20.0);
	}
}
