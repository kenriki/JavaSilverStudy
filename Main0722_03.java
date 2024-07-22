package demo;


interface MyIF {
	default void x() {
		y();
		System.out.print("default ");
	}
	private void y() {
		System.out.print("private ");
	}
	void z();
}

abstract class MyAbstract implements MyIF {
	public void x() { MyIF.super.x(); }
}

public class Main0722_03 extends MyAbstract {
	public void x() {
		super.x();
		System.out.print("concrete");
	}
	public static void main(String... args) {
		new Main0722_03().x();
	}
	/**
	 * このメソッドを追加しないとMyIFとの互換性が取れなくエラーとなる
	 */
	@Override
	public void z() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
