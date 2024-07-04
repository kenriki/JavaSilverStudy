package demo.sample3;

/**
 * StringBuilderの値を更新して表示させたい
 */
public class App10_17 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.insert(0, "Hello "); // ここになにをいれるかを考える
		System.out.println(sb);
	}

}
