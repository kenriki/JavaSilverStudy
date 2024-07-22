package demo;

public class Main0722_04_2 {
	public static void main(String... args) {
		int result = 0;
		try {
			result = new RectangleZ(Integer.parseInt(args[0]), Integer.parseInt(args[1])).calc();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
	}
}

sealed interface ShapeZ permits RectangleZ {
}

record RectangleZ(int heigh, int width) implements ShapeZ {
	public int calc() { return heigh() * width();}
}
