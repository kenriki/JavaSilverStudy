package demo.sample3;

/**
 * 課題10の22 クラス
 */
public class App10_22 {

	/**
	 * 課題10の22 クラスのMainメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		Item a = new Item(1, "pen");
		Item b = new Item(1, "pen");
		Item c = a;

		boolean ans1 = a == b;//同一性
		boolean ans2 = a.name.equals(b.name);//同値性
		System.out.println(ans1 + ":" + ans2);

	}

}
