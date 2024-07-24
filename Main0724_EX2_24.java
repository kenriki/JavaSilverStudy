package demo;

public class Main0724_EX2_24 {
	public static void main(String... args) {
		var list = new String[][] { { "田中", "鈴木" }, { "佐藤", null } };

		System.out.println("list.length: " + list.length);
		for (var i = 0; i < list.length; i++) {
			for (var j = 0; j < 2; j++) {
				System.out.print(list[i][j] + ":");
			}
		}
		System.out.println();
		System.out.println("list[0][0]: "+list[0][0] + " ");
		System.out.println("list[0][1]: "+list[0][1] + " ");
		System.out.println("list[1][0]: "+list[1][0] + " ");
		System.out.println("list[1][1]: "+list[1][1] + " ");

	}
}
