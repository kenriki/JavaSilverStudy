package demo.sample3;

public class App10_01 {
	int i = 0;
	static int num = 0;

	public void test() {
		while (i < 3) {
			i++;
			num++;
		}
	}
	
	public static void main(String[] args) {
		App10_01 a = new App10_01();
		App10_01 b = new App10_01();
		a.test();
		b.test();
		System.out.println(a.num + ":" + b.num);
	}
}
