package demo.sample3;

public class App10_08 {
	public static void main(String[] args) {
		String phone = "03-1234-5678";
		String x = "**-****-";
		System.out.println(x + phone.substring(8, 12));
		StringBuilder sb = new StringBuilder(phone);
		StringBuilder s = sb.insert(0, x);
		System.out.println(s);

	}

}