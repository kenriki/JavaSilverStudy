package demo.sample3;

/**
 * NullPointerExceptionになる例
 */
public class App10_10 {
	public static void main(String[] args) {
		String[] str = new String[2];
		int i = 0;
		for (String s : str) {
			str[i].concat("e" + i);
			i++;
		}
		for (i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}