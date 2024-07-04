package demo.sample6.App10_62;

public class Main implements Z {
	public static void main(String[] args) {
		new Main().execute("hello");
	}

	@Override
	public void execute(String str) {
		System.out.println(str + " テストさん");

	}
}
