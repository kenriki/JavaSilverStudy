package demo;

public class Main0723_29 {

	public static void main(String[] args) {
		Object[] obj = { new Item(), new Clothes(), "TBD ", new Object() };
		for (Object o : obj) {
			method(o);
		}

	}

	private static void method(Object obj) {
		if (obj instanceof Clothes c) {
			System.out.print(c.name);
		} else if (obj instanceof Item i) {
			System.out.print(i.name);
		} else if (!(obj instanceof String s)) {
			System.out.print("N/A ");
		} else {
			System.out.print(s);
		}

	}

}

class Item {
	public final String name = "Item ";
}

class Clothes {
	public final String name = "Clothes ";
}