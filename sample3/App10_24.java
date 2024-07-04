package demo.sample3;

import java.util.ArrayList;
import java.util.List;

/**
 * 課題10の24 クラス
 */
public class App10_24 {

	/**
	 * 課題10の24 クラスのMainメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(0, "D");
		System.out.println(list);

	}

}
