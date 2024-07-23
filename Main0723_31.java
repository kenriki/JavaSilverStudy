package demo;

import java.util.ArrayList;

/**
 * コンパイルエラーの確認
 *  コメントアウトしているところ外して確認する
 */
public class Main0723_31 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Duke ");
		//var x = list.add(0, "Happy ");  // Variable initializer is 'void' -- cannot infer variable type

	}

}
