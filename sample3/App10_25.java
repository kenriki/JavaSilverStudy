package demo.sample3;

import demo.sample3.Sample;
import demo.sample3.Test;

/**
 * 課題10の25 クラス
 */
public class App10_25 {

	/**
	 * 課題10の25 クラスのMainメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		String str = new Sample().janken();
		int num = 100;
		new Test().test(num);
		
		System.out.println(str);

	}

}
