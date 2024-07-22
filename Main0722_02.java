package demo;

/**
 * 例外の再スローについて
 */
public class Main0722_02 {

	public static void main(String... args) {
		try {
			evaluate(1);
		} catch (Exception e) {
			System.out.println(e.getCause());
		}

	}

	public static void evaluate(int value) throws Exception {
		try {
			switch (value) {
				case 1 -> throw new UserException("User Ex!");
				case 2 -> throw new CustomException("Custom Ex");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}

	}

}

class UserException extends Exception {
	public UserException(String str) {
		super(str);
	}
}
class CustomException extends Exception {
	public CustomException(String str) {
		super(str);
	}
}
