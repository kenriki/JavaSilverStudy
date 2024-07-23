package demo;

public class Main0723_27 {
	static String id = "1:";
	String name = "Duke ";
	public static void main(String... args) {
		Main0723_27 o1 = new Main0723_27();
		Main0723_27 o2 = new Main0723_27();
		o2.id = "2: ";
		o2.name = "James ";
		System.out.print(o1.id + o1.name + o2.id + o2.name);
		o1 = o2;
		o1.name = "Scott";
		System.out.print(o1.id + o1.name +  Main0723_27.id + o2.name);
	}
}

