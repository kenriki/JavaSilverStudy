package demo;

public class Main0723_43 {

	public static void main(String[] args) {
		String[] list = { "Mon", "Sat", "Friday", "Day", "Sun" };
		try {
			execute(list);
		} catch (DataTooLongException
				| InvaliDataException ex) {
			ex.getMessage();
		}
	}

	public static void execute(String[] l)
			throws DataTooLongException, InvaliDataException {

		for (var s : l) {
			switch (s) {
			case "Mon", "Tue", "Wed", "Thu", "Fri" -> System.out.print("Open ");
			case "Sat", "Sun" -> System.out.print("Close ");
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" -> throw new DataTooLongException(
					s + "");
			default -> throw new InvaliDataException(s + "");
			}
		}

	}

}

class DataTooLongException extends Exception {

	public DataTooLongException(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
}

class InvaliDataException extends Exception {

	public InvaliDataException(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
}