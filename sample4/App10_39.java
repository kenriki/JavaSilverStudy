package demo.sample4;

/**
 * 
 * 実行結果
 * [Ldemo.sample4.Item;@24d46ca6
 * demo.sample4.Item@4517d9a3
 * 80
 * 
 */
public class App10_39 {

	public static void main(String[] args) {
		Item[] items = {
				new Item("apple", 100),
				new Item("banana", 100),
				new Item("orange", 80),
				new Item("mango", 80)
		};

		System.out.println(items);
		System.out.println(items[2]);
		System.out.println(items[2].price);
	}
}
