package demo;

import java.util.Arrays;

public class Main0723_26 {
	public static void main(String... args) {
		Integer[] number = { 0b0011, 5, 10, 0x000C };
		for (var i = 0; i < number.length; i++) {
			number[i] = Calc.operate(number[i]);
		}
		System.out.println(Arrays.toString(number));
	}
}

class Calc {
	public static int operate(Integer obj) throws RuntimeException {
		return switch (obj) {
			case 3,4,5 -> ++obj;
			default -> --obj;
		};
	}
}
