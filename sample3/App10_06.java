package demo.sample3;

import java.util.ArrayList;
import java.util.List;

/**
 * OutOfMemoryErrorになる例
 */
public class App10_06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			while (true) {
				list.add("hello");
			}
		} catch (RuntimeException e) {
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
		}		
		System.out.println("C");

	}

}