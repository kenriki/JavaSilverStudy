package demo.sample3;

/*
 * (★）コメントでthis()の際は次のエラーになることを確認
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	コンストラクター App10_15() は未定義です

 */
public class App10_15 {
	String name;
	int price = 100;

	//コンストラクタ
	public App10_15(String name) {
		super(); //問いではここが、this()になっているためコンパイルエラーとなる(★)
		this.name = name;
	}

	public App10_15(String name, int age) {
		this(name);
		this.price = age;
	}

	public String toString() {
		return name + " " + price;

	}

	public static void main(String[] args) {

		App10_15 p1 = new App10_15("apple");
		App10_15 p2 = new App10_15("banana", 200);

		System.out.println(p1);
		System.out.println(p2);

	}

}
