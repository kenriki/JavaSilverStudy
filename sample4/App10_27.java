package demo.sample4;

/**
 * コンパイルエラーになる問い
 * 	RuntimeException の到達不可能な catch ブロック。すでに Exception の catch ブロックによって処理されています
 */
public class App10_27 {

	public static void main(String[] args) {
		try {
			throw new Exception();
		} 
		catch (Exception e) {
			throw new RuntimeException();
		} 
//		catch (RuntimeException e) {
//			System.out.println("A");
//		} 
		finally {
			System.out.println("B");
		}

	}
}
