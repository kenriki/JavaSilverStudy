package demo.sample4;

import java.util.ArrayList;
import java.util.List;

public class App10_40 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");

		if (list.remove("b")) {
			list.remove("d");
		}

		System.out.println(list);
	}
}
