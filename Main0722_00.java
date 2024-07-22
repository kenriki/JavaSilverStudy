package demo;

public class Main0722_00 {

	static int code;
	static {
		code = 100;
	}

	private String name;

	public Main0722_00(String name) {
		this.name = name;
	}

	public void setName(String name) {
		name = name; // 変数 name への代入は無効となり、値が更新されないことを確認する
	}

	public String toString() {
		return "name:" + name;
	}

	public static void main(String[] args) {
		Main0722_00 main = new Main0722_00("東新宿");
		main.setName("新宿三丁目");

		System.out.println(main);
	}

}
