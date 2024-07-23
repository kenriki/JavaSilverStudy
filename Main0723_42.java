package demo;

sealed class Super permits Sub {
	double execute(double value) {
		return value * 1.25;
	}
}

final class Sub extends Super {
	int execute(int value) { //メソッドのシグネチャ注意
		return (int) (value * 1.1);
	}

	double execute(double v1, double v2) {
		return v1 * v2;
	}
}

public class Main0723_42 {

	public static void main(String[] args) {
		System.out.print(new Super().execute(10) + ":");
		System.out.print(new Sub().execute(2.0, 3.0));
	}

}
