package demo.sample4;

public class App10_52 {

	public static void main(String[] args) {
		int x = 5;
		while (test(x)) {
			System.out.print(x +" ");
			x--;
		}
	}
	
	public static boolean test(int x) {
		return x-- > 0 ? true : false;
	}
}
