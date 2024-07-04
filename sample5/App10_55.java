package demo.sample5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App10_55 {

	public static void test(List<Sample> list, Predicate<Sample> p) {
		for (Sample s : list) {
			if (p.test(s)) {
				System.out.println(s.str);
			}
		}
	}

	public static void main(String[] args) {
		List<Sample> list = Arrays.asList(
				new Sample("A", 30),
				new Sample("B", 20),
				new Sample("C", 10));
		test(list, s -> s.getNum() > 20);
	}

}
