package demo;

public class Main0724_EX2_45 implements CX {

	public static int operate(int a, int b) {
		return a * b;
	}

	public static void main(String... args) {
		System.out.println("operate result:" + operate(9, 9));
	}
}

sealed interface AX permits CX {
	static int operate(int a, int b) {
		return a * b;
	}
}

//sealed interface BX {
//	default Integer operate(int x, int y) {
//		return x += y;
//	}
//}

non-sealed interface CX extends AX {}