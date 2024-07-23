package demo;

public class Main0723_41 {

	public static void main(String... args) {
		ItemZ item = new ItemZ("abc");
		int y = 1;
		new Main0723_41().method(item, y);
		System.out.print(item.x + ":" + y + ":");
	}

	public void method(ItemZ item, int y) {
		item.x = "xyz";
		y += 2;
		System.out.print(item.x + ":" + y + ":");
	}
}

class ItemZ {
	public String x;

	public ItemZ(String x) {
		this.x = x;
	}
}